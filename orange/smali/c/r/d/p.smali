.class public Lc/r/d/p;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/r/d/s;


# direct methods
.method public constructor <init>(Lc/r/d/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/r/d/p;->a:Lc/r/d/s;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    iget-object p2, p0, Lc/r/d/p;->a:Lc/r/d/s;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    move-result p3

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result p1

    .line 3
    invoke-virtual {p2, p3, p1}, Lc/r/d/s;->a(II)V

    return-void
.end method
