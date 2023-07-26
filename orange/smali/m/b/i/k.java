public class m.b.i.k implements m.b.k.s0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.StringBuilder a; //synthetic
	 /* # direct methods */
	 public m.b.i.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, Integer p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void b ( Object p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* instance-of p2, p1, Lm/b/i/u; */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 2 */
			 /* check-cast p1, Lm/b/i/u; */
			 /* .line 3 */
			 p2 = this.a;
			 m.b.i.l .a ( p2,p1 );
			 /* .line 4 */
		 } // :cond_0
		 /* instance-of p2, p1, Lm/b/i/l; */
		 if ( p2 != null) { // if-eqz p2, :cond_2
			 /* .line 5 */
			 /* check-cast p1, Lm/b/i/l; */
			 /* .line 6 */
			 p2 = this.a;
			 p2 = 			 (( java.lang.StringBuilder ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I
			 /* if-lez p2, :cond_2 */
			 /* .line 7 */
			 p2 = 			 (( m.b.i.l ) p1 ).x ( ); // invoke-virtual {p1}, Lm/b/i/l;->x()Z
			 /* if-nez p2, :cond_1 */
			 m.b.i.l .a ( p1 );
			 (( m.b.j.g0 ) p1 ).b ( ); // invoke-virtual {p1}, Lm/b/j/g0;->b()Ljava/lang/String;
			 final String p2 = "br"; // const-string p2, "br"
			 p1 = 			 (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_2
			 } // :cond_1
			 p1 = this.a;
			 /* .line 8 */
			 p1 = 			 m.b.i.u .a ( p1 );
			 /* if-nez p1, :cond_2 */
			 /* .line 9 */
			 p1 = this.a;
			 final String p2 = " "; // const-string p2, " "
			 (( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 } // :cond_2
	 } // :goto_0
	 return;
} // .end method
