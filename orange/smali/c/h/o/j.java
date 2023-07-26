public abstract class c.h.o.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( android.widget.ListView p0, Integer p1 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* const/16 v1, 0x13 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 2 */
		 p0 = 		 (( android.widget.ListView ) p0 ).canScrollList ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ListView;->canScrollList(I)Z
		 /* .line 3 */
	 } // :cond_0
	 v0 = 	 (( android.widget.ListView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getChildCount()I
	 int v1 = 0; // const/4 v1, 0x0
	 /* if-nez v0, :cond_1 */
	 /* .line 4 */
} // :cond_1
v2 = (( android.widget.ListView ) p0 ).getFirstVisiblePosition ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
int v3 = 1; // const/4 v3, 0x1
/* if-lez p1, :cond_4 */
/* add-int/lit8 p1, v0, -0x1 */
/* .line 5 */
(( android.widget.ListView ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
p1 = (( android.view.View ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/View;->getBottom()I
/* add-int/2addr v2, v0 */
/* .line 6 */
v0 = (( android.widget.ListView ) p0 ).getCount ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getCount()I
/* if-lt v2, v0, :cond_2 */
/* .line 7 */
v0 = (( android.widget.ListView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getHeight()I
p0 = (( android.widget.ListView ) p0 ).getListPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingBottom()I
/* sub-int/2addr v0, p0 */
/* if-le p1, v0, :cond_3 */
} // :cond_2
int v1 = 1; // const/4 v1, 0x1
} // :cond_3
/* .line 8 */
} // :cond_4
(( android.widget.ListView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
p1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* if-gtz v2, :cond_5 */
/* .line 9 */
p0 = (( android.widget.ListView ) p0 ).getListPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingTop()I
/* if-ge p1, p0, :cond_6 */
} // :cond_5
int v1 = 1; // const/4 v1, 0x1
} // :cond_6
} // .end method
public static void b ( android.widget.ListView p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.widget.ListView ) p0 ).scrollListBy ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ListView;->scrollListBy(I)V
/* .line 3 */
} // :cond_0
v0 = (( android.widget.ListView ) p0 ).getFirstVisiblePosition ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_1 */
return;
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
(( android.widget.ListView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
/* if-nez v1, :cond_2 */
return;
/* .line 5 */
} // :cond_2
v1 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
/* sub-int/2addr v1, p1 */
/* .line 6 */
(( android.widget.ListView ) p0 ).setSelectionFromTop ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/widget/ListView;->setSelectionFromTop(II)V
} // :goto_0
return;
} // .end method
