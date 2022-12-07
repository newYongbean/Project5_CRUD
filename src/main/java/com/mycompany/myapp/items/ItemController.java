package com.mycompany.myapp.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/items")
public class ItemController {
    @Autowired
    ItemsServiceImpl itemService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String itemsList(Model model) {
        model.addAttribute("list", itemService.getItemsList());
        return "list";
    }

    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String addPost() {
        return "addpostform";
    }

    @RequestMapping(value="/addok", method = RequestMethod.POST)
    public String addPostOK(ITEMSVO vo) {
        int i = itemService.insertItems(vo);
        if (i == 0)
            System.out.println("데이터 추가 실패 ");
        else
            System.out.println("데이터 추가 성공!!!");
        return "redirect:list";
    }

    @RequestMapping(value="/editpost/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") Integer id, Model model) {
        ITEMSVO itemsVO = itemService.getItems(id);
        model.addAttribute("itemsVO", itemsVO);
        return "editform";
    }

    @RequestMapping(value="/editok", method = RequestMethod.POST)
    public String editPostOK(ITEMSVO vo) {
        int i = itemService.updateItems(vo);
        if (i == 0)
            System.out.println("데이터 수정 실패 ");
        else
            System.out.println("데이터 수정 성공!!!");
        return "redirect:list";
    }

    @RequestMapping(value="/deleteok/{id}", method = RequestMethod.GET)
    public String deletePost(@PathVariable("id") int id) {
        int i = itemService.deleteItems(id);
        if (i == 0)
            System.out.println("데이터 삭제 실패 ");
        else
            System.out.println("데이터 삭제 성공!!!");
        return "redirect:../list";
    }
}
