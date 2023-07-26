public class e.f.c.n.h.d implements e.f.c.n.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.f.c.n.h.f a; //synthetic
	 /* # direct methods */
	 public e.f.c.n.h.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* .line 5 */
		 /* new-instance v0, Ljava/io/StringWriter; */
		 /* invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V */
		 /* .line 6 */
		 try { // :try_start_0
			 (( e.f.c.n.h.d ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/n/h/d;->a(Ljava/lang/Object;Ljava/io/Writer;)V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 7 */
			 /* :catch_0 */
			 (( java.io.StringWriter ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
		 } // .end method
		 public void a ( java.lang.Object p0, java.io.Writer p1 ) {
			 /* .locals 7 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Ljava/io/IOException; */
			 /* } */
		 } // .end annotation
		 /* .line 1 */
		 /* new-instance v6, Le/f/c/n/h/g; */
		 v0 = this.a;
		 /* .line 2 */
		 e.f.c.n.h.f .a ( v0 );
		 v0 = this.a;
		 e.f.c.n.h.f .b ( v0 );
		 v0 = this.a;
		 e.f.c.n.h.f .c ( v0 );
		 v0 = this.a;
		 v5 = 		 e.f.c.n.h.f .d ( v0 );
		 /* move-object v0, v6 */
		 /* move-object v1, p2 */
		 /* invoke-direct/range {v0 ..v5}, Le/f/c/n/h/g;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Le/f/c/n/c;Z)V */
		 int p2 = 0; // const/4 p2, 0x0
		 /* .line 3 */
		 (( e.f.c.n.h.g ) v6 ).a ( p1, p2 ); // invoke-virtual {v6, p1, p2}, Le/f/c/n/h/g;->a(Ljava/lang/Object;Z)Le/f/c/n/h/g;
		 /* .line 4 */
		 (( e.f.c.n.h.g ) v6 ).a ( ); // invoke-virtual {v6}, Le/f/c/n/h/g;->a()V
		 return;
	 } // .end method
