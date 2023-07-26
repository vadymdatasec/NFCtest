public class m.b.i.s implements m.b.k.s0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.Appendable a;
	 public m.b.i.g b;
	 /* # direct methods */
	 public m.b.i.s ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, Integer p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( m.b.i.t ) p1 ).i ( ); // invoke-virtual {p1}, Lm/b/i/t;->i()Ljava/lang/String;
		 final String v1 = "#text"; // const-string v1, "#text"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 try { // :try_start_0
			 v0 = this.a;
			 v1 = this.b;
			 (( m.b.i.t ) p1 ).c ( v0, p2, v1 ); // invoke-virtual {p1, v0, p2, v1}, Lm/b/i/t;->c(Ljava/lang/Appendable;ILm/b/i/g;)V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 /* .line 3 */
			 /* new-instance p2, Lorg/jsoup/SerializationException; */
			 /* invoke-direct {p2, p1}, Lorg/jsoup/SerializationException;-><init>(Ljava/lang/Throwable;)V */
			 /* throw p2 */
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
public void b ( Object p0, Integer p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.a;
		 v1 = this.b;
		 (( m.b.i.t ) p1 ).b ( v0, p2, v1 ); // invoke-virtual {p1, v0, p2, v1}, Lm/b/i/t;->b(Ljava/lang/Appendable;ILm/b/i/g;)V
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 return;
		 /* :catch_0 */
		 /* move-exception p1 */
		 /* .line 2 */
		 /* new-instance p2, Lorg/jsoup/SerializationException; */
		 /* invoke-direct {p2, p1}, Lorg/jsoup/SerializationException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw p2 */
	 } // .end method
