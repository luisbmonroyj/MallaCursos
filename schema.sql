DROP TABLE IF EXISTS "course";
DROP TABLE IF EXISTS "teacher";

CREATE TABLE "teacher" (
  "id" BIGINT NOT NULL,
  "name" TEXT NOT NULL,
  "lastname" TEXT NOT NULL,
  "email" TEXT NOT NULL UNIQUE,--SECURITY REASONS, to avoid cross matches
  PRIMARY KEY ("id")
);

CREATE TABLE "course" (
  "name" TEXT NOT NULL UNIQUE,
  "description" TEXT NOT NULL,
  "duration" INTEGER NOT NULL,
  "price" DOUBLE NOT NULL DEFAULT 0.0,
  "beginningDate" TIMESTAMP NOT NULL,
  "idTeacher" BIGINT NOT NULL,
  FOREIGN KEY ("idTeacher") REFERENCES "teacher"."id"
);

