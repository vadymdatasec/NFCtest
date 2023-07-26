public abstract class c.h.e.d0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.h.e.c0$a a;
	 public java.lang.CharSequence b;
	 public java.lang.CharSequence c;
	 public Boolean d;
	 /* # direct methods */
	 public c.h.e.d0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/h/e/d0;->d:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract java.lang.String a ( ) {
	 } // .end method
	 public void a ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* .line 4 */
		 /* iget-boolean v0, p0, Lc/h/e/d0;->d:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 5 */
			 v0 = this.c;
			 final String v1 = "android.summaryText"; // const-string v1, "android.summaryText"
			 (( android.os.Bundle ) p1 ).putCharSequence ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
			 /* .line 6 */
		 } // :cond_0
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 final String v1 = "android.title.big"; // const-string v1, "android.title.big"
			 /* .line 7 */
			 (( android.os.Bundle ) p1 ).putCharSequence ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
			 /* .line 8 */
		 } // :cond_1
		 (( c.h.e.d0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/e/d0;->a()Ljava/lang/String;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 final String v1 = "androidx.core.app.extra.COMPAT_TEMPLATE"; // const-string v1, "androidx.core.app.extra.COMPAT_TEMPLATE"
			 /* .line 9 */
			 (( android.os.Bundle ) p1 ).putString ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
		 } // :cond_2
		 return;
	 } // .end method
	 public void a ( c.h.e.c0$a p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 /* if-eq v0, p1, :cond_0 */
		 /* .line 2 */
		 this.a = p1;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 3 */
			 (( c.h.e.c0$a ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/h/e/c0$a;->a(Lc/h/e/d0;)Lc/h/e/c0$a;
		 } // :cond_0
		 return;
	 } // .end method
	 public abstract void a ( Object p0 ) {
	 } // .end method
	 public android.widget.RemoteViews b ( Object p0 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public android.widget.RemoteViews c ( Object p0 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public android.widget.RemoteViews d ( Object p0 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
