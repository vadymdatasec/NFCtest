public class inal extends m.b.j.o0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lm/b/j/o0;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lm/b/i/b; */
		 /* invoke-direct {v0}, Lm/b/i/b;-><init>()V */
		 this.j = v0;
		 /* .line 3 */
		 v0 = m.b.j.p0.c;
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public m.b.j.n0 a ( java.lang.String p0, Object p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* .line 2 */
		 this.j = p2;
		 /* .line 3 */
		 (( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 this.c = p1;
	 } // .end method
	 public m.b.j.o0 l ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-super {p0}, Lm/b/j/o0;->l()Lm/b/j/o0; */
		 /* .line 3 */
		 /* new-instance v0, Lm/b/i/b; */
		 /* invoke-direct {v0}, Lm/b/i/b;-><init>()V */
		 this.j = v0;
	 } // .end method
	 public m.b.j.q0 l ( ) { //bridge//synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( m.b.j.n0 ) p0 ).l ( ); // invoke-virtual {p0}, Lm/b/j/n0;->l()Lm/b/j/o0;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.j;
		 final String v1 = ">"; // const-string v1, ">"
		 final String v2 = "<"; // const-string v2, "<"
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( m.b.i.b ) v0 ).size ( ); // invoke-virtual {v0}, Lm/b/i/b;->size()I
			 /* if-lez v0, :cond_0 */
			 /* .line 2 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( m.b.j.o0 ) p0 ).r ( ); // invoke-virtual {p0}, Lm/b/j/o0;->r()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v2 = " "; // const-string v2, " "
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v2 = this.j;
			 (( m.b.i.b ) v2 ).toString ( ); // invoke-virtual {v2}, Lm/b/i/b;->toString()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( m.b.j.o0 ) p0 ).r ( ); // invoke-virtual {p0}, Lm/b/j/o0;->r()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
