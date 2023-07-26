public abstract class m.b.k.u extends m.b.k.q0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a;
	 public final Integer b;
	 /* # direct methods */
	 public m.b.k.u ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lm/b/k/q0;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Lm/b/k/u;->a:I */
		 /* .line 3 */
		 /* iput p2, p0, Lm/b/k/u;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract java.lang.String a ( ) {
	 } // .end method
	 public Boolean a ( Object p0, Object p1 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 (( m.b.i.l ) p2 ).l ( ); // invoke-virtual {p2}, Lm/b/i/l;->l()Lm/b/i/l;
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 2 */
			 /* instance-of v0, v0, Lm/b/i/i; */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
			 } // :cond_0
			 p1 = 			 (( m.b.k.u ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lm/b/k/u;->b(Lm/b/i/l;Lm/b/i/l;)I
			 /* .line 4 */
			 /* iget p2, p0, Lm/b/k/u;->a:I */
			 int v0 = 1; // const/4 v0, 0x1
			 /* if-nez p2, :cond_2 */
			 /* iget p2, p0, Lm/b/k/u;->b:I */
			 /* if-ne p1, p2, :cond_1 */
			 int v1 = 1; // const/4 v1, 0x1
		 } // :cond_1
		 /* .line 5 */
	 } // :cond_2
	 /* iget v2, p0, Lm/b/k/u;->b:I */
	 /* sub-int v3, p1, v2 */
	 /* mul-int v3, v3, p2 */
	 /* if-ltz v3, :cond_3 */
	 /* sub-int/2addr p1, v2 */
	 /* rem-int/2addr p1, p2 */
	 /* if-nez p1, :cond_3 */
	 int v1 = 1; // const/4 v1, 0x1
} // :cond_3
} // :goto_0
} // .end method
public abstract Integer b ( Object p0, Object p1 ) {
} // .end method
public java.lang.String toString ( ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Lm/b/k/u;->a:I */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
int v3 = 2; // const/4 v3, 0x2
/* if-nez v0, :cond_0 */
/* new-array v0, v3, [Ljava/lang/Object; */
/* .line 2 */
(( m.b.k.u ) p0 ).a ( ); // invoke-virtual {p0}, Lm/b/k/u;->a()Ljava/lang/String;
/* aput-object v3, v0, v2 */
/* iget v2, p0, Lm/b/k/u;->b:I */
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v0, v1 */
final String v1 = ":%s(%d)"; // const-string v1, ":%s(%d)"
java.lang.String .format ( v1,v0 );
/* .line 3 */
} // :cond_0
/* iget v0, p0, Lm/b/k/u;->b:I */
/* if-nez v0, :cond_1 */
/* new-array v0, v3, [Ljava/lang/Object; */
/* .line 4 */
(( m.b.k.u ) p0 ).a ( ); // invoke-virtual {p0}, Lm/b/k/u;->a()Ljava/lang/String;
/* aput-object v3, v0, v2 */
/* iget v2, p0, Lm/b/k/u;->a:I */
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v0, v1 */
final String v1 = ":%s(%dn)"; // const-string v1, ":%s(%dn)"
java.lang.String .format ( v1,v0 );
} // :cond_1
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 5 */
(( m.b.k.u ) p0 ).a ( ); // invoke-virtual {p0}, Lm/b/k/u;->a()Ljava/lang/String;
/* aput-object v4, v0, v2 */
/* iget v2, p0, Lm/b/k/u;->a:I */
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v0, v1 */
/* iget v1, p0, Lm/b/k/u;->b:I */
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v3 */
final String v1 = ":%s(%dn%+d)"; // const-string v1, ":%s(%dn%+d)"
java.lang.String .format ( v1,v0 );
} // .end method
