.class public Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public b:I

.field public c:I

.field public d:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

.field public final e:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const p1, 0x7f050059

    .line 5
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c(I)Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->e:Landroid/graphics/Paint;

    return-void
.end method

.method private getLevelColor()I
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView$a;->a:[I

    iget-object v1, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->d:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const v0, 0x7f050059

    return v0

    :cond_0
    const v0, 0x7f050001

    return v0

    :cond_1
    const/high16 v0, 0x7f050000

    return v0

    :cond_2
    const v0, 0x7f050002

    return v0

    :cond_3
    const v0, 0x7f050004

    return v0

    :cond_4
    const v0, 0x7f050003

    return v0
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .line 3
    iget v0, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->b:I

    div-int/lit8 v0, v0, 0x5

    mul-int p1, p1, v0

    return p1
.end method

.method public final a(Landroid/graphics/Paint;Landroid/graphics/Canvas;I)V
    .locals 10

    add-int/lit8 v0, p3, -0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->a(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40a00000    # 5.0f

    add-float v3, v0, v1

    invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->b(I)I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->a(I)I

    move-result p3

    int-to-float p3, p3

    sub-float v5, p3, v1

    iget p3, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c:I

    int-to-float v6, p3

    const/high16 v7, 0x41200000    # 10.0f

    const/high16 v8, 0x41200000    # 10.0f

    move-object v2, p2

    move-object v9, p1

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->d:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-lt v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(I)I
    .locals 1

    rsub-int/lit8 p1, p1, 0x5

    .line 1
    iget v0, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c:I

    div-int/lit8 v0, v0, 0x5

    mul-int p1, p1, v0

    return p1
.end method

.method public final c(I)Landroid/graphics/Paint;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/high16 v1, 0x41200000    # 10.0f

    .line 2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-static {}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->values()[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 3
    invoke-virtual {p0, v3}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-direct {p0}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->getLevelColor()I

    move-result v4

    invoke-virtual {p0, v4}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c(I)Landroid/graphics/Paint;

    move-result-object v4

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->e:Landroid/graphics/Paint;

    :goto_1
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {p0, v4, p1, v3}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->a(Landroid/graphics/Paint;Landroid/graphics/Canvas;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    iput p1, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->b:I

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->c:I

    return-void
.end method

.method public setRssiLevel(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->d:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
