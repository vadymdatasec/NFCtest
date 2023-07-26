public class com.orange.hce.proto.activity.NetworkQualityIndicatorView extends android.view.View {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer b;
	 public Integer c;
	 public com.orange.oab.contactless.packid.rssi.RssiLevel d;
	 public final android.graphics.Paint e;
	 /* # direct methods */
	 public com.orange.hce.proto.activity.NetworkQualityIndicatorView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public com.orange.hce.proto.activity.NetworkQualityIndicatorView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public com.orange.hce.proto.activity.NetworkQualityIndicatorView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public com.orange.hce.proto.activity.NetworkQualityIndicatorView ( ) {
		 /* .locals 0 */
		 /* .line 4 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 /* const p1, 0x7f050059 */
		 /* .line 5 */
		 (( com.orange.hce.proto.activity.NetworkQualityIndicatorView ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c(I)Landroid/graphics/Paint;
		 this.e = p1;
		 return;
	 } // .end method
	 private Integer getLevelColor ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = com.orange.hce.proto.activity.NetworkQualityIndicatorView$a.a;
		 v1 = this.d;
		 v1 = 		 (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
		 /* aget v0, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-eq v0, v1, :cond_4 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* if-eq v0, v1, :cond_3 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* if-eq v0, v1, :cond_2 */
		 int v1 = 4; // const/4 v1, 0x4
		 /* if-eq v0, v1, :cond_1 */
		 int v1 = 5; // const/4 v1, 0x5
		 /* if-eq v0, v1, :cond_0 */
		 /* const v0, 0x7f050059 */
	 } // :cond_0
	 /* const v0, 0x7f050001 */
} // :cond_1
/* const/high16 v0, 0x7f050000 */
} // :cond_2
/* const v0, 0x7f050002 */
} // :cond_3
/* const v0, 0x7f050004 */
} // :cond_4
/* const v0, 0x7f050003 */
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0 ) {
/* .locals 1 */
/* .line 3 */
/* iget v0, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->b:I */
/* div-int/lit8 v0, v0, 0x5 */
/* mul-int p1, p1, v0 */
} // .end method
public final void a ( android.graphics.Paint p0, android.graphics.Canvas p1, Integer p2 ) {
/* .locals 10 */
/* add-int/lit8 v0, p3, -0x1 */
/* .line 2 */
v0 = (( com.orange.hce.proto.activity.NetworkQualityIndicatorView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->a(I)I
/* int-to-float v0, v0 */
/* const/high16 v1, 0x40a00000 # 5.0f */
/* add-float v3, v0, v1 */
v0 = (( com.orange.hce.proto.activity.NetworkQualityIndicatorView ) p0 ).b ( p3 ); // invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->b(I)I
/* int-to-float v4, v0 */
p3 = (( com.orange.hce.proto.activity.NetworkQualityIndicatorView ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->a(I)I
/* int-to-float p3, p3 */
/* sub-float v5, p3, v1 */
/* iget p3, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c:I */
/* int-to-float v6, p3 */
/* const/high16 v7, 0x41200000 # 10.0f */
/* const/high16 v8, 0x41200000 # 10.0f */
/* move-object v2, p2 */
/* move-object v9, p1 */
/* invoke-virtual/range {v2 ..v9}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V */
return;
} // .end method
public final Boolean a ( com.orange.oab.contactless.packid.rssi.RssiLevel p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
v0 = (( java.lang.Enum ) v0 ).ordinal ( ); // invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I
p1 = (( java.lang.Enum ) p1 ).ordinal ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I
/* if-lt v0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Integer b ( Integer p0 ) {
/* .locals 1 */
/* rsub-int/lit8 p1, p1, 0x5 */
/* .line 1 */
/* iget v0, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c:I */
/* div-int/lit8 v0, v0, 0x5 */
/* mul-int p1, p1, v0 */
} // .end method
public final android.graphics.Paint c ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
/* const/high16 v1, 0x41200000 # 10.0f */
/* .line 2 */
(( android.graphics.Paint ) v0 ).setStrokeWidth ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
/* .line 3 */
(( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
p1 = c.h.f.f .a ( v1,p1 );
(( android.graphics.Paint ) v0 ).setColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 5 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V */
/* .line 2 */
com.orange.oab.contactless.packid.rssi.RssiLevel .values ( );
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
/* .line 3 */
v4 = (( com.orange.hce.proto.activity.NetworkQualityIndicatorView ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
v4 = /* invoke-direct {p0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->getLevelColor()I */
(( com.orange.hce.proto.activity.NetworkQualityIndicatorView ) p0 ).c ( v4 ); // invoke-virtual {p0, v4}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c(I)Landroid/graphics/Paint;
} // :cond_0
v4 = this.e;
} // :goto_1
v3 = (( java.lang.Enum ) v3 ).ordinal ( ); // invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I
(( com.orange.hce.proto.activity.NetworkQualityIndicatorView ) p0 ).a ( v4, p1, v3 ); // invoke-virtual {p0, v4, p1, v3}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->a(Landroid/graphics/Paint;Landroid/graphics/Canvas;I)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Landroid/view/View;->onLayout(ZIIII)V */
/* .line 2 */
p1 = (( android.view.View ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getWidth()I
/* iput p1, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->b:I */
/* .line 3 */
p1 = (( android.view.View ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getHeight()I
/* iput p1, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c:I */
return;
} // .end method
public void setRssiLevel ( com.orange.oab.contactless.packid.rssi.RssiLevel p0 ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* .line 2 */
(( android.view.View ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/view/View;->invalidate()V
return;
} // .end method
