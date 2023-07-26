public class com.google.android.material.internal.BaselineLayout extends android.view.ViewGroup {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer b;
	 /* # direct methods */
	 public com.google.android.material.internal.BaselineLayout ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0, v1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 int p1 = -1; // const/4 p1, -0x1
		 /* .line 2 */
		 /* iput p1, p0, Lcom/google/android/material/internal/BaselineLayout;->b:I */
		 return;
	 } // .end method
	 public com.google.android.material.internal.BaselineLayout ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 int p1 = -1; // const/4 p1, -0x1
		 /* .line 4 */
		 /* iput p1, p0, Lcom/google/android/material/internal/BaselineLayout;->b:I */
		 return;
	 } // .end method
	 public com.google.android.material.internal.BaselineLayout ( ) {
		 /* .locals 0 */
		 /* .line 5 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 int p1 = -1; // const/4 p1, -0x1
		 /* .line 6 */
		 /* iput p1, p0, Lcom/google/android/material/internal/BaselineLayout;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getBaseline ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lcom/google/android/material/internal/BaselineLayout;->b:I */
	 } // .end method
	 public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 p1 = 		 (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
		 /* .line 2 */
		 p3 = 		 (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
		 /* sub-int/2addr p4, p2 */
		 /* .line 3 */
		 p2 = 		 (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
		 /* sub-int/2addr p4, p2 */
		 /* sub-int/2addr p4, p3 */
		 /* .line 4 */
		 p2 = 		 (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
		 int p5 = 0; // const/4 p5, 0x0
	 } // :goto_0
	 /* if-ge p5, p1, :cond_2 */
	 /* .line 5 */
	 (( android.view.ViewGroup ) p0 ).getChildAt ( p5 ); // invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
	 /* .line 6 */
	 v1 = 	 (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
	 /* const/16 v2, 0x8 */
	 /* if-ne v1, v2, :cond_0 */
	 /* .line 7 */
} // :cond_0
v1 = (( android.view.View ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
/* .line 8 */
v2 = (( android.view.View ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int v3, p4, v1 */
/* .line 9 */
/* div-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v3, p3 */
/* .line 10 */
/* iget v4, p0, Lcom/google/android/material/internal/BaselineLayout;->b:I */
int v5 = -1; // const/4 v5, -0x1
/* if-eq v4, v5, :cond_1 */
v4 = (( android.view.View ) v0 ).getBaseline ( ); // invoke-virtual {v0}, Landroid/view/View;->getBaseline()I
/* if-eq v4, v5, :cond_1 */
/* .line 11 */
/* iget v4, p0, Lcom/google/android/material/internal/BaselineLayout;->b:I */
/* add-int/2addr v4, p2 */
v5 = (( android.view.View ) v0 ).getBaseline ( ); // invoke-virtual {v0}, Landroid/view/View;->getBaseline()I
/* sub-int/2addr v4, v5 */
} // :cond_1
/* move v4, p2 */
} // :goto_1
/* add-int/2addr v1, v3 */
/* add-int/2addr v2, v4 */
/* .line 12 */
(( android.view.View ) v0 ).layout ( v3, v4, v1, v2 ); // invoke-virtual {v0, v3, v4, v1, v2}, Landroid/view/View;->layout(IIII)V
} // :goto_2
/* add-int/lit8 p5, p5, 0x1 */
} // :cond_2
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 11 */
/* .line 1 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = -1; // const/4 v1, -0x1
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = -1; // const/4 v6, -0x1
int v7 = -1; // const/4 v7, -0x1
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 3 */
v9 = (( android.view.View ) v8 ).getVisibility ( ); // invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
/* const/16 v10, 0x8 */
/* if-ne v9, v10, :cond_0 */
/* .line 4 */
} // :cond_0
(( android.view.ViewGroup ) p0 ).measureChild ( v8, p1, p2 ); // invoke-virtual {p0, v8, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V
/* .line 5 */
v9 = (( android.view.View ) v8 ).getBaseline ( ); // invoke-virtual {v8}, Landroid/view/View;->getBaseline()I
/* if-eq v9, v1, :cond_1 */
/* .line 6 */
v6 = java.lang.Math .max ( v6,v9 );
/* .line 7 */
v10 = (( android.view.View ) v8 ).getMeasuredHeight ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int/2addr v10, v9 */
v7 = java.lang.Math .max ( v7,v10 );
/* .line 8 */
} // :cond_1
v9 = (( android.view.View ) v8 ).getMeasuredWidth ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
v4 = java.lang.Math .max ( v4,v9 );
/* .line 9 */
v9 = (( android.view.View ) v8 ).getMeasuredHeight ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
v3 = java.lang.Math .max ( v3,v9 );
/* .line 10 */
v8 = (( android.view.View ) v8 ).getMeasuredState ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredState()I
v5 = android.view.View .combineMeasuredStates ( v5,v8 );
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
/* if-eq v6, v1, :cond_3 */
/* .line 11 */
v0 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
v0 = java.lang.Math .max ( v7,v0 );
/* add-int/2addr v0, v6 */
/* .line 12 */
v3 = java.lang.Math .max ( v3,v0 );
/* .line 13 */
/* iput v6, p0, Lcom/google/android/material/internal/BaselineLayout;->b:I */
/* .line 14 */
} // :cond_3
v0 = (( android.view.ViewGroup ) p0 ).getSuggestedMinimumHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I
v0 = java.lang.Math .max ( v3,v0 );
/* .line 15 */
v1 = (( android.view.ViewGroup ) p0 ).getSuggestedMinimumWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I
v1 = java.lang.Math .max ( v4,v1 );
/* .line 16 */
p1 = android.view.View .resolveSizeAndState ( v1,p1,v5 );
/* shl-int/lit8 v1, v5, 0x10 */
/* .line 17 */
p2 = android.view.View .resolveSizeAndState ( v0,p2,v1 );
/* .line 18 */
(( android.view.ViewGroup ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
return;
} // .end method
