.class public final Le/e/a/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Le/e/a/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public static final synthetic a(Le/e/a/t;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/e/a/t;->a(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Le/e/a/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/e/a/q;",
            ">;)",
            "Le/e/a/t;"
        }
    .end annotation

    const-string v0, "bubbleShowCaseBuilderList"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final a()V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Le/e/a/t;->a(I)V

    return-void
.end method

.method public final a(I)V
    .locals 3

    .line 4
    iget-object v0, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 5
    iget-object v2, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/e/a/q;

    invoke-virtual {v2, v0}, Le/e/a/q;->a(Z)Le/e/a/q;

    .line 6
    iget-object v0, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/e/a/q;

    invoke-virtual {v0, v1}, Le/e/a/q;->b(Z)Le/e/a/q;

    goto :goto_0

    .line 7
    :cond_1
    iget-object v2, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    if-ne p1, v2, :cond_2

    .line 8
    iget-object v2, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/e/a/q;

    invoke-virtual {v2, v1}, Le/e/a/q;->a(Z)Le/e/a/q;

    .line 9
    iget-object v1, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/e/a/q;

    invoke-virtual {v1, v0}, Le/e/a/q;->b(Z)Le/e/a/q;

    goto :goto_0

    .line 10
    :cond_2
    iget-object v0, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/e/a/q;

    invoke-virtual {v0, v1}, Le/e/a/q;->a(Z)Le/e/a/q;

    .line 11
    iget-object v0, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/e/a/q;

    invoke-virtual {v0, v1}, Le/e/a/q;->b(Z)Le/e/a/q;

    .line 12
    :goto_0
    iget-object v0, p0, Le/e/a/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/e/a/q;

    new-instance v1, Le/e/a/s;

    invoke-direct {v1, p0, p1}, Le/e/a/s;-><init>(Le/e/a/t;I)V

    invoke-virtual {v0, v1}, Le/e/a/q;->a(Le/e/a/a0;)Le/e/a/q;

    .line 13
    invoke-virtual {v0}, Le/e/a/q;->v()Le/e/a/o;

    return-void
.end method
