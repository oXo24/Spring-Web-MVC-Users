package org.example.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.app.entity.Candidate;
import org.example.app.service.ext.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class CandidateController {

    @Autowired
    private CandidateService service;

    @RequestMapping("/candidates")
    public String viewCandidates(Model model) {
        List<Candidate> candidates = service.fetchAll();
        model.addAttribute("title", "Candidates");
        model.addAttribute("candidate", candidates);
        return "candidates";
    }

    @RequestMapping("/add-candidate")
    public String addCandidate(Model model) {
        model.addAttribute("title", "Add Candidate");
        return "candidate_add";
    }

    @RequestMapping(value = "/handle-candidate", method = RequestMethod.POST)
    public RedirectView handleCandidate(@ModelAttribute Candidate candidate, HttpServletRequest request) {
        service.save(candidate);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/candidates");
        return redirectView;
    }

    @RequestMapping("/update-candidate/{id}")
    public String updateCandidate(@PathVariable("id") Long id, Model model) {
        model.addAttribute("title","Update Candidate");
        Candidate candidate = service.fetchById(id);
        model.addAttribute("candidate", candidate);
        return "candidate_update";
    }

    @RequestMapping("/delete-candidate/{id}")
    public RedirectView deleteCandidate(@PathVariable("id") Long id, HttpServletRequest request) {
        service.delete(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/candidates");
        return redirectView;
    }

}
