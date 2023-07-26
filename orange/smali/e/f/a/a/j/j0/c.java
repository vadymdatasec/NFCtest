public class e.f.a.a.j.j0.c implements e.f.a.a.j.j0.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.util.logging.Logger f;
	 /* # instance fields */
	 public final e.f.a.a.j.j0.j.y a;
	 public final java.util.concurrent.Executor b;
	 public final e.f.a.a.j.g0.g c;
	 public final e.f.a.a.j.j0.k.e d;
	 public final e.f.a.a.j.k0.b e;
	 /* # direct methods */
	 public static e.f.a.a.j.j0.c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* const-class v0, Le/f/a/a/j/c0; */
		 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 java.util.logging.Logger .getLogger ( v0 );
		 return;
	 } // .end method
	 public e.f.a.a.j.j0.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 this.c = p2;
		 /* .line 4 */
		 this.a = p3;
		 /* .line 5 */
		 this.d = p4;
		 /* .line 6 */
		 this.e = p5;
		 return;
	 } // .end method
	 public static java.lang.Object a ( Object p0, Object p1, Object p2 ) { //synthethic
		 /* .locals 1 */
		 /* .line 13 */
		 v0 = this.d;
		 /* .line 14 */
		 p0 = this.a;
		 int p2 = 1; // const/4 p2, 0x1
		 int p0 = 0; // const/4 p0, 0x0
	 } // .end method
	 public static void a ( Object p0, Object p1, Object p2, Object p3 ) { //synthethic
		 /* .locals 2 */
		 /* .line 2 */
		 try { // :try_start_0
			 v0 = this.c;
			 /* .line 3 */
			 (( e.f.a.a.j.x ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;
			 /* if-nez v0, :cond_0 */
			 final String p0 = "Transport backend \'%s\' is not registered"; // const-string p0, "Transport backend \'%s\' is not registered"
			 int p3 = 1; // const/4 p3, 0x1
			 /* new-array p3, p3, [Ljava/lang/Object; */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 4 */
			 (( e.f.a.a.j.x ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;
			 /* aput-object p1, p3, v0 */
			 /* .line 5 */
			 java.lang.String .format ( p0,p3 );
			 /* .line 6 */
			 p1 = e.f.a.a.j.j0.c.f;
			 (( java.util.logging.Logger ) p1 ).warning ( p0 ); // invoke-virtual {p1, p0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V
			 /* .line 7 */
			 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
			 /* invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
			 return;
			 /* .line 8 */
		 } // :cond_0
		 /* .line 9 */
		 v0 = this.e;
		 e.f.a.a.j.j0.b .a ( p0,p1,p3 );
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 10 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* .line 11 */
		 p1 = e.f.a.a.j.j0.c.f;
		 /* new-instance p3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v0 = "Error scheduling event "; // const-string v0, "Error scheduling event "
		 (( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.Exception ) p0 ).getMessage ( ); // invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
		 (( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.util.logging.Logger ) p1 ).warning ( p3 ); // invoke-virtual {p1, p3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V
		 /* .line 12 */
	 } // :goto_0
	 return;
} // .end method
/* # virtual methods */
public void a ( Object p0, Object p1, Object p2 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 e.f.a.a.j.j0.a .a ( p0,p1,p3,p2 );
	 return;
} // .end method
