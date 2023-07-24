.class public abstract Le/h/b/a/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/view/View;II)Le/e/a/q;
    .locals 2

    .line 20
    new-instance v0, Le/e/a/q;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-direct {v0, v1}, Le/e/a/q;-><init>(Landroid/app/Activity;)V

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/e/a/q;->c(Ljava/lang/String;)Le/e/a/q;

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/e/a/q;->a(Ljava/lang/String;)Le/e/a/q;

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f050026

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    invoke-virtual {v0, p1}, Le/e/a/q;->a(I)Le/e/a/q;

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f0e011f

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/e/a/q;->b(Ljava/lang/String;)Le/e/a/q;

    new-instance p1, Le/h/b/a/j;

    invoke-direct {p1}, Le/h/b/a/j;-><init>()V

    .line 25
    invoke-virtual {v0, p1}, Le/e/a/q;->a(Le/e/a/r;)Le/e/a/q;

    .line 26
    invoke-virtual {v0, p0}, Le/e/a/q;->a(Landroid/view/View;)Le/e/a/q;

    return-object v0
.end method

.method public static a(Le/h/b/a/l/y0;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 13

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Le/h/b/a/l/y0;->d(I)Le/h/b/a/m/d;

    move-result-object p0

    .line 2
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->c(I)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v1

    check-cast v1, Le/h/b/a/m/e;

    const/4 v2, 0x0

    .line 3
    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->c(I)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object p2

    check-cast p2, Le/h/b/a/m/f;

    if-eqz v1, :cond_1

    if-eqz p0, :cond_1

    if-eqz p2, :cond_1

    const v3, 0x7f0e011b

    const v4, 0x7f0e011c

    .line 4
    invoke-static {p1, v3, v4}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object p1

    .line 5
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView$d0;->a:Landroid/view/View;

    const v3, 0x7f0e014e

    const v4, 0x7f0e014f

    invoke-static {p2, v3, v4}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object p2

    .line 6
    invoke-virtual {v1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v3

    const v4, 0x7f0e0057

    const v5, 0x7f0e0056

    invoke-static {v3, v4, v5}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object v3

    .line 7
    invoke-virtual {v1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v4

    const v5, 0x7f0e00d5

    const v6, 0x7f0e00d6

    invoke-static {v4, v5, v6}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object v4

    .line 8
    iget-object v5, v1, Landroidx/recyclerview/widget/RecyclerView$d0;->a:Landroid/view/View;

    const v6, 0x7f0e003a

    const v7, 0x7f0e0042

    invoke-static {v5, v6, v7}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object v5

    .line 9
    invoke-virtual {v1}, Le/h/b/a/m/e;->E()Landroid/widget/ImageView;

    move-result-object v6

    const v7, 0x7f0e0044

    const v8, 0x7f0e0045

    invoke-static {v6, v7, v8}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object v6

    .line 10
    invoke-virtual {v1}, Le/h/b/a/m/e;->P()Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;

    move-result-object v7

    const v8, 0x7f0e011d

    const v9, 0x7f0e011e

    invoke-static {v7, v8, v9}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object v7

    .line 11
    invoke-virtual {v1}, Le/h/b/a/m/e;->I()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v8

    const v9, 0x7f0e00aa

    const v10, 0x7f0e00ab

    invoke-static {v8, v9, v10}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object v8

    .line 12
    invoke-virtual {v1}, Le/h/b/a/m/e;->O()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v9

    const v10, 0x7f0e017e

    const v11, 0x7f0e017f

    invoke-static {v9, v10, v11}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object v9

    .line 13
    invoke-virtual {v1}, Le/h/b/a/m/e;->K()Landroid/widget/ImageButton;

    move-result-object v1

    const v10, 0x7f0e00b8

    const v11, 0x7f0e00b9

    invoke-static {v1, v10, v11}, Le/h/b/a/k;->a(Landroid/view/View;II)Le/e/a/q;

    move-result-object v1

    .line 14
    new-instance v10, Le/e/a/t;

    invoke-direct {v10}, Le/e/a/t;-><init>()V

    const/4 v11, 0x4

    new-array v12, v11, [Le/e/a/q;

    aput-object p1, v12, v2

    aput-object p2, v12, v0

    const/4 p1, 0x2

    aput-object v5, v12, p1

    const/4 p2, 0x3

    aput-object v6, v12, p2

    .line 15
    invoke-static {v12}, Le/f/b/b/k;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v5

    .line 16
    invoke-virtual {p0}, Le/h/b/a/m/d;->z()Z

    move-result p0

    if-eqz p0, :cond_0

    new-array p0, v11, [Le/e/a/q;

    aput-object v4, p0, v2

    aput-object v9, p0, v0

    aput-object v8, p0, p1

    aput-object v1, p0, p2

    .line 17
    invoke-static {p0}, Le/f/b/b/k;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    const/4 p0, 0x5

    new-array p0, p0, [Le/e/a/q;

    aput-object v7, p0, v2

    aput-object v3, p0, v0

    aput-object v9, p0, p1

    aput-object v8, p0, p2

    aput-object v1, p0, v11

    .line 18
    invoke-static {p0}, Le/f/b/b/k;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 19
    :goto_0
    invoke-virtual {v10, v5}, Le/e/a/t;->a(Ljava/util/List;)Le/e/a/t;

    invoke-virtual {v10}, Le/e/a/t;->a()V

    :cond_1
    return-void
.end method
