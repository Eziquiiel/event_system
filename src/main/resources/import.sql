INSERT INTO tb_participant(email, name) VALUES ('José Silva', 'jose@gmail.com')
INSERT INTO tb_participant(email, name) VALUES ('Tiago Faria', 'tiago@gmail.com')
INSERT INTO tb_participant(email, name) VALUES ('Maria do Rosário', 'maria@gmail.com')
INSERT INTO tb_participant(email, name) VALUES ('Teresa Silva', 'teresa@gmail.com')

INSERT INTO tb_category(description) VALUES ('Curso')
INSERT INTO tb_category(description) VALUES ('Oficina')

INSERT INTO tb_activity(id, name, description, price, category_id) VALUES (1, 'Curso de HTML', 'Aprenda Html de forma prática', 80.00, 1)
INSERT INTO tb_activity(id, name, description, price, category_id) VALUES (2, 'Oficina de Github', 'Controle versões de seus projetos', 50.00, 2)

INSERT INTO tb_block(begin, ending, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T08:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z', 1)
INSERT INTO tb_block(begin, ending, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T18:00:00Z', 2)
INSERT INTO tb_block(begin, ending, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-26T08:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-26T11:00:00Z', 2)


INSERT INTO tb_activity_participant(participant_id, activity_id) VALUES (1, 1)
INSERT INTO tb_activity_participant(participant_id, activity_id) VALUES (1, 2)
INSERT INTO tb_activity_participant(participant_id, activity_id) VALUES (2, 1)
INSERT INTO tb_activity_participant(participant_id, activity_id) VALUES (3, 1)
INSERT INTO tb_activity_participant(participant_id, activity_id) VALUES (3, 2)
INSERT INTO tb_activity_participant(participant_id, activity_id) VALUES (4, 2)
