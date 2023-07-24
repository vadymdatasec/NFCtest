.class public Le/h/b/a/m/f;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "SourceFile"


# instance fields
.field public final t:Landroid/widget/ImageView;

.field public final u:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const v0, 0x7f080159

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Le/h/b/a/m/f;->t:Landroid/widget/ImageView;

    const v0, 0x7f08015a

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Le/h/b/a/m/f;->u:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public C()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/f;->t:Landroid/widget/ImageView;

    return-object v0
.end method

.method public D()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/f;->u:Landroid/widget/TextView;

    return-object v0
.end method
