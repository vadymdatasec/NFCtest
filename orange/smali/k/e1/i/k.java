public abstract class k.e1.i.k {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( k.f0 p0 ) {
		 /* .locals 2 */
		 /* .line 9 */
		 (( k.f0 ) p0 ).c ( ); // invoke-virtual {p0}, Lk/f0;->c()Ljava/lang/String;
		 /* .line 10 */
		 (( k.f0 ) p0 ).e ( ); // invoke-virtual {p0}, Lk/f0;->e()Ljava/lang/String;
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 11 */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* const/16 v0, 0x3f */
			 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 } // :cond_0
	 } // .end method
	 public static java.lang.String a ( k.u0 p0, java.net.Proxy$Type p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 /* .line 2 */
		 (( k.u0 ) p0 ).e ( ); // invoke-virtual {p0}, Lk/u0;->e()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* const/16 v1, 0x20 */
		 /* .line 3 */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 /* .line 4 */
		 p1 = 		 k.e1.i.k .b ( p0,p1 );
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 5 */
			 (( k.u0 ) p0 ).g ( ); // invoke-virtual {p0}, Lk/u0;->g()Lk/f0;
			 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 /* .line 6 */
		 } // :cond_0
		 (( k.u0 ) p0 ).g ( ); // invoke-virtual {p0}, Lk/u0;->g()Lk/f0;
		 k.e1.i.k .a ( p0 );
		 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 } // :goto_0
	 final String p0 = " HTTP/1.1"; // const-string p0, " HTTP/1.1"
	 /* .line 7 */
	 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 8 */
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Boolean b ( k.u0 p0, java.net.Proxy$Type p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = 	 (( k.u0 ) p0 ).d ( ); // invoke-virtual {p0}, Lk/u0;->d()Z
	 /* if-nez p0, :cond_0 */
	 p0 = java.net.Proxy$Type.HTTP;
	 /* if-ne p1, p0, :cond_0 */
	 int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
