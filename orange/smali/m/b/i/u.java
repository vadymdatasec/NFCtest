public class m.b.i.u extends m.b.i.t {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String h;
	 /* # direct methods */
	 public m.b.i.u ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lm/b/i/t;-><init>()V */
		 /* .line 2 */
		 this.e = p2;
		 /* .line 3 */
		 this.h = p1;
		 return;
	 } // .end method
	 public static Boolean a ( java.lang.StringBuilder p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = 		 (( java.lang.StringBuilder ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( java.lang.StringBuilder ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I
			 /* sub-int/2addr v0, v1 */
			 p0 = 			 (( java.lang.StringBuilder ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->charAt(I)C
			 /* const/16 v0, 0x20 */
			 /* if-ne p0, v0, :cond_0 */
		 } // :cond_0
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
} // .end method
/* # virtual methods */
public java.lang.String a ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 6 */
	 (( m.b.i.u ) p0 ).r ( ); // invoke-virtual {p0}, Lm/b/i/u;->r()V
	 /* .line 7 */
	 /* invoke-super {p0, p1}, Lm/b/i/t;->a(Ljava/lang/String;)Ljava/lang/String; */
} // .end method
public m.b.i.b a ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 (( m.b.i.u ) p0 ).r ( ); // invoke-virtual {p0}, Lm/b/i/u;->r()V
	 /* .line 3 */
	 /* invoke-super {p0}, Lm/b/i/t;->a()Lm/b/i/b; */
} // .end method
public m.b.i.t a ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* .line 4 */
	 (( m.b.i.u ) p0 ).r ( ); // invoke-virtual {p0}, Lm/b/i/u;->r()V
	 /* .line 5 */
	 /* invoke-super {p0, p1, p2}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t; */
} // .end method
public java.lang.String b ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 6 */
	 (( m.b.i.u ) p0 ).r ( ); // invoke-virtual {p0}, Lm/b/i/u;->r()V
	 /* .line 7 */
	 /* invoke-super {p0, p1}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String; */
} // .end method
public void b ( java.lang.Appendable p0, Integer p1, Object p2 ) {
	 /* .locals 6 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
v0 = (( m.b.i.g ) p3 ).g ( ); // invoke-virtual {p3}, Lm/b/i/g;->g()Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 v0 = 	 (( m.b.i.t ) p0 ).p ( ); // invoke-virtual {p0}, Lm/b/i/t;->p()I
	 /* if-nez v0, :cond_0 */
	 v0 = this.b;
	 /* instance-of v1, v0, Lm/b/i/l; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* check-cast v0, Lm/b/i/l; */
		 (( m.b.i.l ) v0 ).B ( ); // invoke-virtual {v0}, Lm/b/i/l;->B()Lm/b/j/g0;
		 v0 = 		 (( m.b.j.g0 ) v0 ).a ( ); // invoke-virtual {v0}, Lm/b/j/g0;->a()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( m.b.i.u ) p0 ).t ( ); // invoke-virtual {p0}, Lm/b/i/u;->t()Z
			 if ( v0 != null) { // if-eqz v0, :cond_1
			 } // :cond_0
			 v0 = 			 (( m.b.i.g ) p3 ).f ( ); // invoke-virtual {p3}, Lm/b/i/g;->f()Z
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 v0 = 				 (( m.b.i.t ) p0 ).q ( ); // invoke-virtual {p0}, Lm/b/i/t;->q()Ljava/util/List;
				 /* if-lez v0, :cond_2 */
				 v0 = 				 (( m.b.i.u ) p0 ).t ( ); // invoke-virtual {p0}, Lm/b/i/u;->t()Z
				 /* if-nez v0, :cond_2 */
				 /* .line 2 */
			 } // :cond_1
			 (( m.b.i.t ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lm/b/i/t;->a(Ljava/lang/Appendable;ILm/b/i/g;)V
			 /* .line 3 */
		 } // :cond_2
		 p2 = 		 (( m.b.i.g ) p3 ).g ( ); // invoke-virtual {p3}, Lm/b/i/g;->g()Z
		 if ( p2 != null) { // if-eqz p2, :cond_3
			 (( m.b.i.t ) p0 ).l ( ); // invoke-virtual {p0}, Lm/b/i/t;->l()Lm/b/i/t;
			 /* instance-of p2, p2, Lm/b/i/l; */
			 if ( p2 != null) { // if-eqz p2, :cond_3
				 /* .line 4 */
				 (( m.b.i.t ) p0 ).l ( ); // invoke-virtual {p0}, Lm/b/i/t;->l()Lm/b/i/t;
				 p2 = 				 m.b.i.l .g ( p2 );
				 /* if-nez p2, :cond_3 */
				 int p2 = 1; // const/4 p2, 0x1
				 int v4 = 1; // const/4 v4, 0x1
			 } // :cond_3
			 int p2 = 0; // const/4 p2, 0x0
			 int v4 = 0; // const/4 v4, 0x0
			 /* .line 5 */
		 } // :goto_0
		 (( m.b.i.u ) p0 ).s ( ); // invoke-virtual {p0}, Lm/b/i/u;->s()Ljava/lang/String;
		 int v3 = 0; // const/4 v3, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 /* move-object v0, p1 */
		 /* move-object v2, p3 */
		 /* invoke-static/range {v0 ..v5}, Lm/b/i/p;->a(Ljava/lang/Appendable;Ljava/lang/String;Lm/b/i/g;ZZZ)V */
		 return;
	 } // .end method
	 public void c ( java.lang.Appendable p0, Integer p1, Object p2 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public Boolean c ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( m.b.i.u ) p0 ).r ( ); // invoke-virtual {p0}, Lm/b/i/u;->r()V
		 /* .line 2 */
		 p1 = 		 /* invoke-super {p0, p1}, Lm/b/i/t;->c(Ljava/lang/String;)Z */
	 } // .end method
	 public java.lang.String i ( ) {
		 /* .locals 1 */
		 final String v0 = "#text"; // const-string v0, "#text"
	 } // .end method
	 public final void r ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.d;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 /* new-instance v0, Lm/b/i/b; */
		 /* invoke-direct {v0}, Lm/b/i/b;-><init>()V */
		 this.d = v0;
		 /* .line 3 */
		 v1 = this.h;
		 final String v2 = "text"; // const-string v2, "text"
		 (( m.b.i.b ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lm/b/i/b;->a(Ljava/lang/String;Ljava/lang/String;)V
	 } // :cond_0
	 return;
} // .end method
public java.lang.String s ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.d;
	 /* if-nez v0, :cond_0 */
	 v0 = this.h;
} // :cond_0
final String v1 = "text"; // const-string v1, "text"
(( m.b.i.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lm/b/i/b;->a(Ljava/lang/String;)Ljava/lang/String;
} // :goto_0
} // .end method
public Boolean t ( ) {
/* .locals 1 */
/* .line 1 */
(( m.b.i.u ) p0 ).s ( ); // invoke-virtual {p0}, Lm/b/i/u;->s()Ljava/lang/String;
v0 = m.b.h.i .a ( v0 );
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( m.b.i.t ) p0 ).j ( ); // invoke-virtual {p0}, Lm/b/i/t;->j()Ljava/lang/String;
} // .end method
