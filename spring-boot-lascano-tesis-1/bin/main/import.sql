INSERT INTO public.usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (1, 'andres','$2a$10$L.vTFGItGYiJNR/D3h.8U.k79aozb2NXm3nWQPpvtkkjaXFte58Ya',true, 'Andres', 'Lascano', 'rlascano@uce.edu.ec');
INSERT INTO public.usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (2, 'admin','$2a$10$NPa1BfOGEzvefbD97D0UYO0J/PjTBPVYshI5HcVYnwTDbwDe7cONO',true, 'Andres1', 'Lascano1', 'rlascano1@uce.edu.ec');

INSERT INTO public.roles (id, nombre) VALUES (1, 'ROLE_USER');
INSERT INTO public.roles (id, nombre) VALUES (2, 'ROLE_ADMIN');

INSERT INTO public.usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO public.usuarios_roles (usuario_id, role_id) VALUES (2, 2);