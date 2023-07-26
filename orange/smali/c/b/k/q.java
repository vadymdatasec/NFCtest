public class c.b.k.q extends c.b.k.p0 implements android.content.DialogInterface {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.appcompat.app.AlertController d;
	 /* # direct methods */
	 public c.b.k.q ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p2 = 		 c.b.k.q .b ( p1,p2 );
		 /* invoke-direct {p0, p1, p2}, Lc/b/k/p0;-><init>(Landroid/content/Context;I)V */
		 /* .line 2 */
		 /* new-instance p1, Landroidx/appcompat/app/AlertController; */
		 (( android.app.Dialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;
		 (( android.app.Dialog ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
		 /* invoke-direct {p1, p2, p0, v0}, Landroidx/appcompat/app/AlertController;-><init>(Landroid/content/Context;Lc/b/k/p0;Landroid/view/Window;)V */
		 this.d = p1;
		 return;
	 } // .end method
	 public static Integer b ( android.content.Context p0, Integer p1 ) {
		 /* .locals 2 */
		 /* ushr-int/lit8 v0, p1, 0x18 */
		 /* and-int/lit16 v0, v0, 0xff */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 /* new-instance p1, Landroid/util/TypedValue; */
	 /* invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V */
	 /* .line 2 */
	 (( android.content.Context ) p0 ).getTheme ( ); // invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
	 (( android.content.res.Resources$Theme ) p0 ).resolveAttribute ( v0, p1, v1 ); // invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
	 /* .line 3 */
	 /* iget p0, p1, Landroid/util/TypedValue;->resourceId:I */
} // .end method
/* # virtual methods */
public android.widget.ListView b ( ) {
	 /* .locals 1 */
	 /* .line 4 */
	 v0 = this.d;
	 (( androidx.appcompat.app.AlertController ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/appcompat/app/AlertController;->a()Landroid/widget/ListView;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Lc/b/k/p0;->onCreate(Landroid/os/Bundle;)V */
	 /* .line 2 */
	 p1 = this.d;
	 (( androidx.appcompat.app.AlertController ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/appcompat/app/AlertController;->b()V
	 return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
	 v0 = 	 (( androidx.appcompat.app.AlertController ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/AlertController;->a(ILandroid/view/KeyEvent;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 2 */
	 } // :cond_0
	 p1 = 	 /* invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
	 v0 = 	 (( androidx.appcompat.app.AlertController ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/AlertController;->b(ILandroid/view/KeyEvent;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 2 */
	 } // :cond_0
	 p1 = 	 /* invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z */
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Lc/b/k/p0;->setTitle(Ljava/lang/CharSequence;)V */
	 /* .line 2 */
	 v0 = this.d;
	 (( androidx.appcompat.app.AlertController ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/app/AlertController;->b(Ljava/lang/CharSequence;)V
	 return;
} // .end method
