public abstract class c.b.p.n implements android.view.Window$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.Window$Callback b;
	 /* # direct methods */
	 public c.b.p.n ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 this.b = p1;
			 return;
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "Window callback may not be null"; // const-string v0, "Window callback may not be null"
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 /* # virtual methods */
	 public final android.view.Window$Callback a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public Boolean dispatchGenericMotionEvent ( android.view.MotionEvent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public Boolean dispatchKeyShortcutEvent ( android.view.KeyEvent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public Boolean dispatchPopulateAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public Boolean dispatchTouchEvent ( android.view.MotionEvent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public Boolean dispatchTrackballEvent ( android.view.MotionEvent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public void onActionModeFinished ( android.view.ActionMode p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 return;
	 } // .end method
	 public void onActionModeStarted ( android.view.ActionMode p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 return;
	 } // .end method
	 public void onAttachedToWindow ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 return;
	 } // .end method
	 public void onContentChanged ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 return;
	 } // .end method
	 public Boolean onCreatePanelMenu ( Integer p0, android.view.Menu p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public android.view.View onCreatePanelView ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public void onDetachedFromWindow ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 return;
	 } // .end method
	 public Boolean onMenuItemSelected ( Integer p0, android.view.MenuItem p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public Boolean onMenuOpened ( Integer p0, android.view.Menu p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public void onPanelClosed ( Integer p0, android.view.Menu p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 return;
	 } // .end method
	 public void onPointerCaptureChanged ( Boolean p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 return;
	 } // .end method
	 public Boolean onPreparePanel ( Integer p0, android.view.View p1, android.view.Menu p2 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.b;
	 } // .end method
	 public void onProvideKeyboardShortcuts ( java.util.List p0, android.view.Menu p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Landroid/view/KeyboardShortcutGroup;", */
		 /* ">;", */
		 /* "Landroid/view/Menu;", */
		 /* "I)V" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.b;
	 return;
} // .end method
public Boolean onSearchRequested ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = 	 v0 = this.b;
} // .end method
public Boolean onSearchRequested ( android.view.SearchEvent p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 p1 = 	 v0 = this.b;
} // .end method
public void onWindowAttributesChanged ( android.view.WindowManager$LayoutParams p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 return;
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 return;
} // .end method
public android.view.ActionMode onWindowStartingActionMode ( android.view.ActionMode$Callback p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
} // .end method
public android.view.ActionMode onWindowStartingActionMode ( android.view.ActionMode$Callback p0, Integer p1 ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = this.b;
} // .end method
