public class e.f.c.l.e.r.i implements e.f.c.l.e.r.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.content.Context a;
	 /* # direct methods */
	 public e.f.c.l.e.r.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.File a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/io/File; */
		 v1 = this.a;
		 (( android.content.Context ) v1 ).getFilesDir ( ); // invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
		 final String v2 = ".com.google.firebase.crashlytics"; // const-string v2, ".com.google.firebase.crashlytics"
		 /* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
		 (( e.f.c.l.e.r.i ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/r/i;->a(Ljava/io/File;)Ljava/io/File;
	 } // .end method
	 public java.io.File a ( java.io.File p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 2 */
			 v0 = 			 (( java.io.File ) p1 ).exists ( ); // invoke-virtual {p1}, Ljava/io/File;->exists()Z
			 /* if-nez v0, :cond_1 */
			 v0 = 			 (( java.io.File ) p1 ).mkdirs ( ); // invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
			 } // :cond_0
			 e.f.c.l.e.b .a ( );
			 final String v0 = "Couldn\'t create file"; // const-string v0, "Couldn\'t create file"
			 (( e.f.c.l.e.b ) p1 ).d ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->d(Ljava/lang/String;)V
		 } // :cond_1
	 } // :goto_0
	 /* .line 4 */
} // :cond_2
e.f.c.l.e.b .a ( );
final String v0 = "Null File"; // const-string v0, "Null File"
(( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
} // :goto_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String b ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/io/File; */
v1 = this.a;
(( android.content.Context ) v1 ).getFilesDir ( ); // invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
final String v2 = ".com.google.firebase.crashlytics"; // const-string v2, ".com.google.firebase.crashlytics"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
(( java.io.File ) v0 ).getPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
} // .end method
