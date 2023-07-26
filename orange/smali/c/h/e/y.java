public class c.h.e.y extends c.h.e.d0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.CharSequence e;
	 /* # direct methods */
	 public c.h.e.y ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/h/e/d0;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.h.e.y a ( java.lang.CharSequence p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 c.h.e.c0$a .d ( p1 );
		 this.e = p1;
	 } // .end method
	 public java.lang.String a ( ) {
		 /* .locals 1 */
		 final String v0 = "androidx.core.app.NotificationCompat$BigTextStyle"; // const-string v0, "androidx.core.app.NotificationCompat$BigTextStyle"
	 } // .end method
	 public void a ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* .line 9 */
		 /* invoke-super {p0, p1}, Lc/h/e/d0;->a(Landroid/os/Bundle;)V */
		 /* .line 10 */
		 /* const/16 v1, 0x15 */
		 /* if-ge v0, v1, :cond_0 */
		 /* .line 11 */
		 v0 = this.e;
		 final String v1 = "android.bigText"; // const-string v1, "android.bigText"
		 (( android.os.Bundle ) p1 ).putCharSequence ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
	 } // :cond_0
	 return;
} // .end method
public void a ( Object p0 ) {
	 /* .locals 2 */
	 /* .line 2 */
	 /* const/16 v1, 0x10 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 3 */
	 /* new-instance v0, Landroid/app/Notification$BigTextStyle; */
	 /* .line 4 */
	 /* invoke-direct {v0, p1}, Landroid/app/Notification$BigTextStyle;-><init>(Landroid/app/Notification$Builder;)V */
	 p1 = this.b;
	 /* .line 5 */
	 (( android.app.Notification$BigTextStyle ) v0 ).setBigContentTitle ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
	 v0 = this.e;
	 /* .line 6 */
	 (( android.app.Notification$BigTextStyle ) p1 ).bigText ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
	 /* .line 7 */
	 /* iget-boolean v0, p0, Lc/h/e/d0;->d:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 8 */
		 v0 = this.c;
		 (( android.app.Notification$BigTextStyle ) p1 ).setSummaryText ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/Notification$BigTextStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
	 } // :cond_0
	 return;
} // .end method
public c.h.e.y b ( java.lang.CharSequence p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 c.h.e.c0$a .d ( p1 );
	 this.b = p1;
} // .end method
public c.h.e.y c ( java.lang.CharSequence p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 c.h.e.c0$a .d ( p1 );
	 this.c = p1;
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 2 */
	 /* iput-boolean p1, p0, Lc/h/e/d0;->d:Z */
} // .end method
