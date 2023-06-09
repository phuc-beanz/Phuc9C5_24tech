//package com.tech.app.service.mapper;
//
//import com.tech.app.domain.Roles;
//import com.tech.app.service.dto.RolesDTO;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//@AllArgsConstructor
//public class RolesMapper implements EntityMapper<RolesDTO, Roles>{
//
//    @Override
//    public Roles toEntity(RolesDTO dto) {
//        Roles roles = new Roles();
//        roles.builder()
//                .idRole(dto.getIdRole())
//                .name(dto.getName())
////                .users(userMapper.toEntity(dto.getUsers()))
//                .build();
//        return roles;
//    }
//
//    @Override
//    public RolesDTO toDTO(Roles entity) {
//        RolesDTO rolesDTO = new RolesDTO();
//        rolesDTO.builder()
//                .idRole(entity.getIdRole())
//                .name(entity.getName())
////                .users(userMapper.toDTO(entity.getUsers()))
//                .build();
//        return rolesDTO;
//    }
//
//    @Override
//    public List<Roles> toEntity(List<RolesDTO> dto) {
//        List<Roles> rolesList = new ArrayList<>();
//        dto.forEach(d -> {
//            Roles roles = new Roles();
//            roles.builder()
//                    .idRole(d.getIdRole())
//                    .name(d.getName())
////                    .users(userMapper.toEntity(d.getUsers()))
//                    .build();
//            rolesList.add(roles);
//        });
//        return rolesList;
//    }
//
//    @Override
//    public List<RolesDTO> toDTO(List<Roles> entity) {
//        List<RolesDTO> rolesDTOList = new ArrayList<>();
//        entity.forEach(e -> {
//            RolesDTO rolesDTO = new RolesDTO();
//            rolesDTO.builder()
//                    .idRole(e.getIdRole())
//                    .name(e.getName())
////                    .users(userMapper.toDTO(e.getUsers()))
//                    .build();
//            rolesDTOList.add(rolesDTO);
//        });
//        return rolesDTOList;
//    }
//}
