public class e.f.c.l.e.w.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final java.lang.String b;
	 public final java.lang.StackTraceElement c;
	 public final e.f.c.l.e.w.e d;
	 /* # direct methods */
	 public e.f.c.l.e.w.e ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 (( java.lang.Throwable ) p1 ).getLocalizedMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;
		 this.a = v0;
		 /* .line 3 */
		 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 this.b = v0;
		 /* .line 4 */
		 (( java.lang.Throwable ) p1 ).getStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
		 this.c = v0;
		 /* .line 5 */
		 (( java.lang.Throwable ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 6 */
			 /* new-instance v0, Le/f/c/l/e/w/e; */
			 /* invoke-direct {v0, p1, p2}, Le/f/c/l/e/w/e;-><init>(Ljava/lang/Throwable;Le/f/c/l/e/w/d;)V */
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 this.d = v0;
	 return;
} // .end method
