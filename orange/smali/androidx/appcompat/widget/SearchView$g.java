public class androidx.appcompat.widget.SearchView$g implements android.view.View$OnKeyListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/SearchView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.appcompat.widget.SearchView b; //synthetic
/* # direct methods */
public androidx.appcompat.widget.SearchView$g ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onKey ( android.view.View p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
v1 = this.g0;
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.q;
v0 = (( android.widget.AutoCompleteTextView ) v0 ).isPopupShowing ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
v0 = this.q;
/* .line 3 */
v0 = (( android.widget.AutoCompleteTextView ) v0 ).getListSelection ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getListSelection()I
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_1 */
/* .line 4 */
v0 = this.b;
p1 = (( androidx.appcompat.widget.SearchView ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroidx/appcompat/widget/SearchView;->a(Landroid/view/View;ILandroid/view/KeyEvent;)Z
/* .line 5 */
} // :cond_1
v0 = this.b;
v0 = this.q;
v0 = (( androidx.appcompat.widget.SearchView$SearchAutoComplete ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->a()Z
/* if-nez v0, :cond_2 */
v0 = (( android.view.KeyEvent ) p3 ).hasNoModifiers ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->hasNoModifiers()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
p3 = (( android.view.KeyEvent ) p3 ).getAction ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
int v0 = 1; // const/4 v0, 0x1
/* if-ne p3, v0, :cond_2 */
/* const/16 p3, 0x42 */
/* if-ne p2, p3, :cond_2 */
/* .line 7 */
(( android.view.View ) p1 ).cancelLongPress ( ); // invoke-virtual {p1}, Landroid/view/View;->cancelLongPress()V
/* .line 8 */
p1 = this.b;
int p2 = 0; // const/4 p2, 0x0
p3 = this.q;
(( android.widget.AutoCompleteTextView ) p3 ).getText ( ); // invoke-virtual {p3}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;
/* .line 9 */
(( java.lang.Object ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 10 */
(( androidx.appcompat.widget.SearchView ) p1 ).a ( v2, p2, p3 ); // invoke-virtual {p1, v2, p2, p3}, Landroidx/appcompat/widget/SearchView;->a(ILjava/lang/String;Ljava/lang/String;)V
} // :cond_2
} // .end method
