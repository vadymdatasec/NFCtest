public abstract class i.h.c.n {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final i.h.c.o a;
	 /* # direct methods */
	 public static i.h.c.n ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 final String v1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"; // const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
			 /* .line 1 */
			 java.lang.Class .forName ( v1 );
			 /* .line 2 */
			 (( java.lang.Class ) v1 ).newInstance ( ); // invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
			 /* check-cast v1, Li/h/c/o; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* move-object v0, v1 */
			 /* :catch_0 */
			 /* nop */
		 } // :goto_0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance v0, Li/h/c/o; */
		 /* invoke-direct {v0}, Li/h/c/o;-><init>()V */
	 } // :goto_1
	 return;
} // .end method
public static i.j.b a ( java.lang.Class p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = i.h.c.n.a;
	 (( i.h.c.o ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Li/h/c/o;->a(Ljava/lang/Class;)Li/j/b;
} // .end method
public static i.j.d a ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 3 */
	 v0 = i.h.c.n.a;
	 (( i.h.c.o ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Li/h/c/o;->a(Li/h/c/i;)Li/j/d;
} // .end method
public static java.lang.String a ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = i.h.c.n.a;
	 (( i.h.c.o ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Li/h/c/o;->a(Li/h/c/l;)Ljava/lang/String;
} // .end method
public static i.j.c b ( java.lang.Class p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = i.h.c.n.a;
	 final String v1 = ""; // const-string v1, ""
	 (( i.h.c.o ) v0 ).a ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Li/h/c/o;->a(Ljava/lang/Class;Ljava/lang/String;)Li/j/c;
} // .end method
