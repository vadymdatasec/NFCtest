public class androidx.appcompat.widget.SearchView$SearchAutoComplete extends c.b.q.l {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/SearchView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "SearchAutoComplete" */
} // .end annotation
/* # instance fields */
public Integer e;
public androidx.appcompat.widget.SearchView f;
public Boolean g;
public final java.lang.Runnable h;
/* # direct methods */
public androidx.appcompat.widget.SearchView$SearchAutoComplete ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public androidx.appcompat.widget.SearchView$SearchAutoComplete ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public androidx.appcompat.widget.SearchView$SearchAutoComplete ( ) {
/* .locals 0 */
/* .line 3 */
/* invoke-direct {p0, p1, p2, p3}, Lc/b/q/l;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 4 */
/* new-instance p1, Landroidx/appcompat/widget/SearchView$SearchAutoComplete$a; */
/* invoke-direct {p1, p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete$a;-><init>(Landroidx/appcompat/widget/SearchView$SearchAutoComplete;)V */
this.h = p1;
/* .line 5 */
p1 = (( android.widget.AutoCompleteTextView ) p0 ).getThreshold ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getThreshold()I
/* iput p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->e:I */
return;
} // .end method
private Integer getSearchViewTextMinWidthDp ( ) {
/* .locals 4 */
/* .line 1 */
(( android.widget.AutoCompleteTextView ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* .line 2 */
/* iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I */
/* .line 3 */
/* iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I */
/* const/16 v3, 0x3c0 */
/* if-lt v1, v3, :cond_0 */
/* const/16 v3, 0x2d0 */
/* if-lt v2, v3, :cond_0 */
/* .line 4 */
/* iget v0, v0, Landroid/content/res/Configuration;->orientation:I */
int v3 = 2; // const/4 v3, 0x2
/* if-ne v0, v3, :cond_0 */
/* const/16 v0, 0x100 */
} // :cond_0
/* const/16 v0, 0x258 */
/* if-ge v1, v0, :cond_2 */
/* const/16 v0, 0x280 */
/* if-lt v1, v0, :cond_1 */
/* const/16 v0, 0x1e0 */
/* if-lt v2, v0, :cond_1 */
} // :cond_1
/* const/16 v0, 0xa0 */
} // :cond_2
} // :goto_0
/* const/16 v0, 0xc0 */
} // .end method
/* # virtual methods */
public Boolean a ( ) {
/* .locals 1 */
/* .line 1 */
(( android.widget.AutoCompleteTextView ) p0 ).getText ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;
v0 = android.text.TextUtils .getTrimmedLength ( v0 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void b ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.widget.AutoCompleteTextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getContext()Landroid/content/Context;
final String v1 = "input_method"; // const-string v1, "input_method"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
(( android.view.inputmethod.InputMethodManager ) v0 ).showSoftInput ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
/* .line 4 */
/* iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->g:Z */
} // :cond_0
return;
} // .end method
public Boolean enoughToFilter ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->e:I */
/* if-lez v0, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->enoughToFilter()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public android.view.inputmethod.InputConnection onCreateInputConnection ( android.view.inputmethod.EditorInfo p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/q/l;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
/* .line 2 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.h;
(( android.widget.AutoCompleteTextView ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 4 */
v0 = this.h;
(( android.widget.AutoCompleteTextView ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->post(Ljava/lang/Runnable;)Z
} // :cond_0
} // .end method
public void onFinishInflate ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->onFinishInflate()V */
/* .line 2 */
(( android.widget.AutoCompleteTextView ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 3 */
v1 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getSearchViewTextMinWidthDp()I */
/* int-to-float v1, v1 */
int v2 = 1; // const/4 v2, 0x1
/* .line 4 */
v0 = android.util.TypedValue .applyDimension ( v2,v1,v0 );
/* float-to-int v0, v0 */
(( android.widget.AutoCompleteTextView ) p0 ).setMinWidth ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->setMinWidth(I)V
return;
} // .end method
public void onFocusChanged ( Boolean p0, Integer p1, android.graphics.Rect p2 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3}, Landroid/widget/AutoCompleteTextView;->onFocusChanged(ZILandroid/graphics/Rect;)V */
/* .line 2 */
p1 = this.f;
(( androidx.appcompat.widget.SearchView ) p1 ).m ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView;->m()V
return;
} // .end method
public Boolean onKeyPreIme ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_3 */
/* .line 1 */
v0 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
int v1 = 1; // const/4 v1, 0x1
/* if-nez v0, :cond_1 */
v0 = (( android.view.KeyEvent ) p2 ).getRepeatCount ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
/* if-nez v0, :cond_1 */
/* .line 2 */
(( android.widget.AutoCompleteTextView ) p0 ).getKeyDispatcherState ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( android.view.KeyEvent$DispatcherState ) p1 ).startTracking ( p2, p0 ); // invoke-virtual {p1, p2, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V
} // :cond_0
/* .line 4 */
} // :cond_1
v0 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
/* if-ne v0, v1, :cond_3 */
/* .line 5 */
(( android.widget.AutoCompleteTextView ) p0 ).getKeyDispatcherState ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
(( android.view.KeyEvent$DispatcherState ) v0 ).handleUpEvent ( p2 ); // invoke-virtual {v0, p2}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V
/* .line 7 */
} // :cond_2
v0 = (( android.view.KeyEvent ) p2 ).isTracking ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( android.view.KeyEvent ) p2 ).isCanceled ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z
/* if-nez v0, :cond_3 */
/* .line 8 */
p1 = this.f;
(( androidx.appcompat.widget.SearchView ) p1 ).clearFocus ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView;->clearFocus()V
int p1 = 0; // const/4 p1, 0x0
/* .line 9 */
(( androidx.appcompat.widget.SearchView$SearchAutoComplete ) p0 ).setImeVisibility ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V
/* .line 10 */
} // :cond_3
p1 = /* invoke-super {p0, p1, p2}, Landroid/widget/AutoCompleteTextView;->onKeyPreIme(ILandroid/view/KeyEvent;)Z */
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->onWindowFocusChanged(Z)V */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
p1 = this.f;
p1 = (( android.view.ViewGroup ) p1 ).hasFocus ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->hasFocus()Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = (( android.widget.AutoCompleteTextView ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getVisibility()I
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 3 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->g:Z */
/* .line 4 */
(( android.widget.AutoCompleteTextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getContext()Landroid/content/Context;
v0 = androidx.appcompat.widget.SearchView .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
v0 = androidx.appcompat.widget.SearchView.r0;
(( androidx.appcompat.widget.SearchView$k ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroidx/appcompat/widget/SearchView$k;->a(Landroid/widget/AutoCompleteTextView;Z)V
} // :cond_0
return;
} // .end method
public void performCompletion ( ) {
/* .locals 0 */
return;
} // .end method
public void replaceText ( java.lang.CharSequence p0 ) {
/* .locals 0 */
return;
} // .end method
public void setImeVisibility ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.widget.AutoCompleteTextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getContext()Landroid/content/Context;
final String v1 = "input_method"; // const-string v1, "input_method"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_0 */
/* .line 2 */
/* iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->g:Z */
/* .line 3 */
p1 = this.h;
(( android.widget.AutoCompleteTextView ) p0 ).removeCallbacks ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 4 */
(( android.widget.AutoCompleteTextView ) p0 ).getWindowToken ( ); // invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getWindowToken()Landroid/os/IBinder;
(( android.view.inputmethod.InputMethodManager ) v0 ).hideSoftInputFromWindow ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
return;
/* .line 5 */
} // :cond_0
p1 = (( android.view.inputmethod.InputMethodManager ) v0 ).isActive ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 6 */
/* iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->g:Z */
/* .line 7 */
p1 = this.h;
(( android.widget.AutoCompleteTextView ) p0 ).removeCallbacks ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 8 */
(( android.view.inputmethod.InputMethodManager ) v0 ).showSoftInput ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
return;
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
/* .line 9 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->g:Z */
return;
} // .end method
public void setSearchView ( androidx.appcompat.widget.SearchView p0 ) {
/* .locals 0 */
/* .line 1 */
this.f = p1;
return;
} // .end method
public void setThreshold ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->e:I */
return;
} // .end method
