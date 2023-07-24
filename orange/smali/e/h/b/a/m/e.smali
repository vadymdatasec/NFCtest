.class public Le/h/b/a/m/e;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "SourceFile"


# instance fields
.field public final A:Landroid/widget/ImageButton;

.field public final B:Landroid/view/ViewGroup;

.field public final C:Landroid/view/View;

.field public final D:Lcom/orange/hce/proto/activity/StateImageButton;

.field public final E:Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;

.field public final F:Landroid/widget/TextView;

.field public final G:Lcom/orange/hce/proto/activity/StateImageButton;

.field public final H:Lcom/orange/hce/proto/activity/StateImageButton;

.field public I:Lcom/orange/hce/proto/activity/StateImageButton;

.field public final t:Landroid/widget/TextView;

.field public final u:Landroid/widget/TextView;

.field public final v:Landroid/widget/ImageView;

.field public final w:Lcom/orange/hce/proto/activity/StateImageButton;

.field public final x:Landroid/widget/TextView;

.field public final y:Landroid/widget/ProgressBar;

.field public final z:Lcom/orange/hce/proto/activity/StateImageButton;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const v0, 0x7f080052

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Le/h/b/a/m/e;->t:Landroid/widget/TextView;

    const v0, 0x7f080059

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Le/h/b/a/m/e;->u:Landroid/widget/TextView;

    const v0, 0x7f080057

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Le/h/b/a/m/e;->v:Landroid/widget/ImageView;

    const v0, 0x7f08005a

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Le/h/b/a/m/e;->F:Landroid/widget/TextView;

    const v0, 0x7f080055

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Le/h/b/a/m/e;->x:Landroid/widget/TextView;

    const v0, 0x7f0800e6

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/orange/hce/proto/activity/StateImageButton;

    iput-object v0, p0, Le/h/b/a/m/e;->w:Lcom/orange/hce/proto/activity/StateImageButton;

    const v0, 0x7f0800f2

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/orange/hce/proto/activity/StateImageButton;

    iput-object v0, p0, Le/h/b/a/m/e;->z:Lcom/orange/hce/proto/activity/StateImageButton;

    const v0, 0x7f080170

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Le/h/b/a/m/e;->y:Landroid/widget/ProgressBar;

    const v0, 0x7f0800aa

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Le/h/b/a/m/e;->A:Landroid/widget/ImageButton;

    const v0, 0x7f080097

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Le/h/b/a/m/e;->B:Landroid/view/ViewGroup;

    const v0, 0x7f080053

    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/e;->C:Landroid/view/View;

    const v0, 0x7f080096

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/orange/hce/proto/activity/StateImageButton;

    iput-object v0, p0, Le/h/b/a/m/e;->D:Lcom/orange/hce/proto/activity/StateImageButton;

    const v0, 0x7f080108

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;

    iput-object v0, p0, Le/h/b/a/m/e;->E:Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;

    const v0, 0x7f080066

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/orange/hce/proto/activity/StateImageButton;

    iput-object v0, p0, Le/h/b/a/m/e;->G:Lcom/orange/hce/proto/activity/StateImageButton;

    const v0, 0x7f0800ed

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/orange/hce/proto/activity/StateImageButton;

    iput-object v0, p0, Le/h/b/a/m/e;->H:Lcom/orange/hce/proto/activity/StateImageButton;

    .line 17
    iget-object v0, p0, Le/h/b/a/m/e;->E:Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-virtual {v0, v1}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->setRssiLevel(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    const v0, 0x7f0800dc

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/orange/hce/proto/activity/StateImageButton;

    iput-object p1, p0, Le/h/b/a/m/e;->I:Lcom/orange/hce/proto/activity/StateImageButton;

    return-void
.end method


# virtual methods
.method public C()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->C:Landroid/view/View;

    return-object v0
.end method

.method public D()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->x:Landroid/widget/TextView;

    return-object v0
.end method

.method public E()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->v:Landroid/widget/ImageView;

    return-object v0
.end method

.method public F()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->F:Landroid/widget/TextView;

    return-object v0
.end method

.method public G()Lcom/orange/hce/proto/activity/StateImageButton;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->G:Lcom/orange/hce/proto/activity/StateImageButton;

    return-object v0
.end method

.method public H()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->t:Landroid/widget/TextView;

    return-object v0
.end method

.method public I()Lcom/orange/hce/proto/activity/StateImageButton;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->D:Lcom/orange/hce/proto/activity/StateImageButton;

    return-object v0
.end method

.method public J()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->B:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public K()Landroid/widget/ImageButton;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->A:Landroid/widget/ImageButton;

    return-object v0
.end method

.method public L()Lcom/orange/hce/proto/activity/StateImageButton;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->I:Lcom/orange/hce/proto/activity/StateImageButton;

    return-object v0
.end method

.method public M()Lcom/orange/hce/proto/activity/StateImageButton;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->w:Lcom/orange/hce/proto/activity/StateImageButton;

    return-object v0
.end method

.method public N()Lcom/orange/hce/proto/activity/StateImageButton;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->H:Lcom/orange/hce/proto/activity/StateImageButton;

    return-object v0
.end method

.method public O()Lcom/orange/hce/proto/activity/StateImageButton;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->z:Lcom/orange/hce/proto/activity/StateImageButton;

    return-object v0
.end method

.method public P()Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->E:Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;

    return-object v0
.end method

.method public Q()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->u:Landroid/widget/TextView;

    return-object v0
.end method

.method public R()Landroid/widget/ProgressBar;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->y:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public S()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/h/b/a/m/e;->B:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Le/h/b/a/m/e;->E:Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-virtual {v0, v1}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->setRssiLevel(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    return-void
.end method
