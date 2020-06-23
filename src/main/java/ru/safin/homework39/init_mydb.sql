-- creating a table "student"
CREATE TABLE public.student
(
    id_st integer NOT NULL,
    surname character varying(100) COLLATE pg_catalog."default" NOT NULL DEFAULT 'Surname'::character varying,
    CONSTRAINT pk_student PRIMARY KEY (id_st)
)

    TABLESPACE pg_default;

ALTER TABLE public.student
    OWNER to postgres;

-- creating a table "exam_st"
CREATE TABLE public.exam_st
(
    id_ex integer NOT NULL,
    subject character varying(30) COLLATE pg_catalog."default" NOT NULL,
    date_time date NOT NULL,
    CONSTRAINT pk_exam_st PRIMARY KEY (id_ex)
)

    TABLESPACE pg_default;

ALTER TABLE public.exam_st
    OWNER to postgres;

-- creating a table "mark_st"
CREATE TABLE public.mark_st
(
    id_ex integer NOT NULL,
    id_st integer NOT NULL,
    mark integer NOT NULL,
    CONSTRAINT idx_mark_st PRIMARY KEY (id_ex, id_st),
    CONSTRAINT fk_mark_st_exam_st FOREIGN KEY (id_ex)
        REFERENCES public.exam_st (id_ex) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT fk_mark_st_student FOREIGN KEY (id_st)
        REFERENCES public.student (id_st) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT check_mark CHECK (mark >= 1 AND mark <= 5)
)

    TABLESPACE pg_default;

ALTER TABLE public.mark_st
    OWNER to postgres;

--filling in the table "student"
--INSERT INTO mybd.public.student (id_st, surname) VALUES (1, 'Иванов');
--INSERT INTO mybd.public.student (id_st, surname) VALUES (2, 'Петров');
--INSERT INTO mybd.public.student (id_st, surname) VALUES (3, 'Сидоров');

--filling in the table "exam_st"
--INSERT INTO mybd.public.exam_st (id_ex, subject, date_time) VALUES (1, 'Физика', '15.06.2020');
--INSERT INTO mybd.public.exam_st (id_ex, subject, date_time) VALUES (2, 'Химия', '14.06.2020');
--INSERT INTO mybd.public.exam_st (id_ex, subject, date_time) VALUES (3, 'Математика', '17.06.2020');
--INSERT INTO mybd.public.exam_st (id_ex, subject, date_time) VALUES (4, 'Информатика', '20.06.2020');

--filling in the table "mark_st"
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (1, 1, 4);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (2, 1, 5);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (3, 1, 4);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (4, 1, 5);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (1, 2, 5);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (2, 2, 5);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (3, 2, 4);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (4, 2, 5);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (1, 3, 3);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (2, 3, 5);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (3, 3, 4);
--INSERT INTO mybd.public.mark_st (id_ex, id_st, mark) VALUES (4, 3, 4);

--common request
--SELECT student.surname, exam_st.subject, exam_st.date_time, mark_st.mark
--FROM student, exam_st, mark_st
--WHERE exam_st.id_ex = mark_st.id_ex
--AND student.id_st = mark_st.id_st
--ORDER BY student.surname