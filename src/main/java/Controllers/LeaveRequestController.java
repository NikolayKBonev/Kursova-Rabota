package Controllers;

import Services.LeaveRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/leave-requests")
public class LeaveRequestController {
    @Autowired
    private LeaveRequestService leaveRequestService;

    @GetMapping
    public String getAllLeaveRequests(Model model) {
        model.addAttribute("leaveRequests", leaveRequestService.getAllLeaveRequests());
        return "leave-requests/list";
    }

    @GetMapping("/{id}")
    public String getLeaveRequestById(@PathVariable Long id, Model model) {
        leaveRequestService.getLeaveRequestById(id).ifPresent(leaveRequest ->
                model.addAttribute("leaveRequest", leaveRequest));
        return "leave-requests/details";
    }
}
