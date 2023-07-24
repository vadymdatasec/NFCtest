.class public Lcom/orange/hce/proto/ScrollViewWithMaxHeight;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const p1, 0x7fffffff

    .line 2
    iput p1, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0, p2}, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->a(Landroid/util/AttributeSet;)I

    move-result p1

    iput p1, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0, p2}, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->a(Landroid/util/AttributeSet;)I

    move-result p1

    iput p1, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    invoke-virtual {p0, p2}, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->a(Landroid/util/AttributeSet;)I

    move-result p1

    iput p1, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/AttributeSet;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Le/h/b/a/i;->ScrollViewWithMaxHeight:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7fffffff

    .line 2
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return v0
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    iget p2, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/widget/ScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, v0

    .line 2
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    const/high16 v0, -0x80000000

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/ScrollView;->onMeasure(II)V

    return-void
.end method
