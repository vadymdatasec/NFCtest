public class androidx.appcompat.widget.SearchView$j implements android.widget.AdapterView$OnItemSelectedListener {
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
public androidx.appcompat.widget.SearchView$j ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onItemSelected ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView<", */
/* "*>;", */
/* "Landroid/view/View;", */
/* "IJ)V" */
/* } */
} // .end annotation
/* .line 1 */
p1 = this.b;
(( androidx.appcompat.widget.SearchView ) p1 ).d ( p3 ); // invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView;->d(I)Z
return;
} // .end method
public void onNothingSelected ( android.widget.AdapterView p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView<", */
/* "*>;)V" */
/* } */
} // .end annotation
return;
} // .end method
