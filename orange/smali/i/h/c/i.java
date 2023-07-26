public abstract class i.h.c.i extends i.h.c.b implements i.h.c.h implements i.j.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer i;
	 public final Integer j;
	 /* # direct methods */
	 public i.h.c.i ( ) {
		 /* .locals 8 */
		 /* and-int/lit8 v0, p6, 0x1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-ne v0, v1, :cond_0 */
		 int v7 = 1; // const/4 v7, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 int v7 = 0; // const/4 v7, 0x0
} // :goto_0
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* move-object v6, p5 */
/* .line 1 */
/* invoke-direct/range {v2 ..v7}, Li/h/c/b;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V */
/* .line 2 */
/* iput p1, p0, Li/h/c/i;->i:I */
/* shr-int/lit8 p1, p6, 0x1 */
/* .line 3 */
/* iput p1, p0, Li/h/c/i;->j:I */
return;
} // .end method
/* # virtual methods */
public i.j.a b ( ) {
/* .locals 0 */
/* .line 1 */
i.h.c.n .a ( p0 );
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, p0, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Li/h/c/i; */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 2 */
/* check-cast p1, Li/h/c/i; */
/* .line 3 */
(( i.h.c.b ) p0 ).e ( ); // invoke-virtual {p0}, Li/h/c/b;->e()Li/j/c;
(( i.h.c.b ) p1 ).e ( ); // invoke-virtual {p1}, Li/h/c/b;->e()Li/j/c;
v1 = i.h.c.k .a ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_1
	 (( i.h.c.b ) p0 ).d ( ); // invoke-virtual {p0}, Li/h/c/b;->d()Ljava/lang/String;
	 (( i.h.c.b ) p1 ).d ( ); // invoke-virtual {p1}, Li/h/c/b;->d()Ljava/lang/String;
	 v1 = 	 (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 (( i.h.c.b ) p0 ).f ( ); // invoke-virtual {p0}, Li/h/c/b;->f()Ljava/lang/String;
		 (( i.h.c.b ) p1 ).f ( ); // invoke-virtual {p1}, Li/h/c/b;->f()Ljava/lang/String;
		 v1 = 		 (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* iget v1, p0, Li/h/c/i;->j:I */
			 /* iget v3, p1, Li/h/c/i;->j:I */
			 /* if-ne v1, v3, :cond_1 */
			 /* iget v1, p0, Li/h/c/i;->i:I */
			 /* iget v3, p1, Li/h/c/i;->i:I */
			 /* if-ne v1, v3, :cond_1 */
			 (( i.h.c.b ) p0 ).c ( ); // invoke-virtual {p0}, Li/h/c/b;->c()Ljava/lang/Object;
			 (( i.h.c.b ) p1 ).c ( ); // invoke-virtual {p1}, Li/h/c/b;->c()Ljava/lang/Object;
			 p1 = 			 i.h.c.k .a ( v1,p1 );
			 if ( p1 != null) { // if-eqz p1, :cond_1
			 } // :cond_1
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
		 /* .line 4 */
	 } // :cond_2
	 /* instance-of v0, p1, Li/j/d; */
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 5 */
		 (( i.h.c.b ) p0 ).a ( ); // invoke-virtual {p0}, Li/h/c/b;->a()Li/j/a;
		 p1 = 		 (( java.lang.Object ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
	 } // :cond_3
} // .end method
public Integer hashCode ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 (( i.h.c.b ) p0 ).e ( ); // invoke-virtual {p0}, Li/h/c/b;->e()Li/j/c;
	 /* if-nez v0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_0
(( i.h.c.b ) p0 ).e ( ); // invoke-virtual {p0}, Li/h/c/b;->e()Li/j/c;
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
/* mul-int/lit8 v0, v0, 0x1f */
} // :goto_0
(( i.h.c.b ) p0 ).d ( ); // invoke-virtual {p0}, Li/h/c/b;->d()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x1f */
(( i.h.c.b ) p0 ).f ( ); // invoke-virtual {p0}, Li/h/c/b;->f()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
(( i.h.c.b ) p0 ).a ( ); // invoke-virtual {p0}, Li/h/c/b;->a()Li/j/a;
/* if-eq v0, p0, :cond_0 */
/* .line 2 */
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 3 */
} // :cond_0
(( i.h.c.b ) p0 ).d ( ); // invoke-virtual {p0}, Li/h/c/b;->d()Ljava/lang/String;
final String v1 = "<init>"; // const-string v1, "<init>"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "constructor (Kotlin reflection is not available)"; // const-string v0, "constructor (Kotlin reflection is not available)"
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "function "; // const-string v1, "function "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( i.h.c.b ) p0 ).d ( ); // invoke-virtual {p0}, Li/h/c/b;->d()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " (Kotlin reflection is not available)"; // const-string v1, " (Kotlin reflection is not available)"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
} // .end method
