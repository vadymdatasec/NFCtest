.class public Le/h/b/a/l/b1;
.super Lc/l/d/b2;
.source "SourceFile"


# instance fields
.field public h:[Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Lc/l/d/o1;[Landroidx/fragment/app/Fragment;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lc/l/d/b2;-><init>(Lc/l/d/o1;I)V

    .line 2
    invoke-virtual {p2}, [Landroidx/fragment/app/Fragment;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroidx/fragment/app/Fragment;

    iput-object p1, p0, Le/h/b/a/l/b1;->h:[Landroidx/fragment/app/Fragment;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/l/b1;->h:[Landroidx/fragment/app/Fragment;

    array-length v0, v0

    return v0
.end method

.method public b(I)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/h/b/a/l/b1;->a()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Le/h/b/a/l/b1;->h:[Landroidx/fragment/app/Fragment;

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
