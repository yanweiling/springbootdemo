-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词条', '3', '1', '/module/word', 'C', '0', 'module:word:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '词条菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词条查询', @parentId, '1',  '#',  'F', '0', 'module:word:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词条新增', @parentId, '2',  '#',  'F', '0', 'module:word:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词条修改', @parentId, '3',  '#',  'F', '0', 'module:word:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词条删除', @parentId, '4',  '#',  'F', '0', 'module:word:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
