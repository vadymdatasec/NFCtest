public class androidx.appcompat.widget.SearchView$a implements android.text.TextWatcher {
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
public androidx.appcompat.widget.SearchView$a ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void afterTextChanged ( android.text.Editable p0 ) {
/* .locals 0 */
return;
} // .end method
public void beforeTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
return;
} // .end method
public void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.b;
(( androidx.appcompat.widget.SearchView ) p2 ).c ( p1 ); // invoke-virtual {p2, p1}, Landroidx/appcompat/widget/SearchView;->c(Ljava/lang/CharSequence;)V
return;
} // .end method
