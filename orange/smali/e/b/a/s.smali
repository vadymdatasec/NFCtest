.class public Le/b/a/s;
.super Le/b/a/c0/a;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "Le/b/a/c0/a<",
        "Le/b/a/s<",
        "TTranscodeType;>;>;",
        "Ljava/lang/Cloneable;",
        "Ljava/lang/Object<",
        "Le/b/a/s<",
        "TTranscodeType;>;>;"
    }
.end annotation


# instance fields
.field public final B:Landroid/content/Context;

.field public final C:Le/b/a/u;

.field public final D:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public final E:Le/b/a/j;

.field public F:Le/b/a/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/v<",
            "*-TTranscodeType;>;"
        }
    .end annotation
.end field

.field public G:Ljava/lang/Object;

.field public H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "TTranscodeType;>;>;"
        }
    .end annotation
.end field

.field public I:Le/b/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public J:Le/b/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public K:Ljava/lang/Float;

.field public L:Z

.field public M:Z

.field public N:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le/b/a/c0/j;

    invoke-direct {v0}, Le/b/a/c0/j;-><init>()V

    sget-object v1, Le/b/a/y/x/c0;->b:Le/b/a/y/x/c0;

    .line 2
    invoke-virtual {v0, v1}, Le/b/a/c0/a;->a(Le/b/a/y/x/c0;)Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    sget-object v1, Le/b/a/n;->e:Le/b/a/n;

    .line 3
    invoke-virtual {v0, v1}, Le/b/a/c0/a;->a(Le/b/a/n;)Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Le/b/a/c0/a;->a(Z)Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    return-void
.end method

.method public constructor <init>(Le/b/a/d;Le/b/a/u;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/d;",
            "Le/b/a/u;",
            "Ljava/lang/Class<",
            "TTranscodeType;>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Le/b/a/c0/a;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le/b/a/s;->L:Z

    .line 3
    iput-object p2, p0, Le/b/a/s;->C:Le/b/a/u;

    .line 4
    iput-object p3, p0, Le/b/a/s;->D:Ljava/lang/Class;

    .line 5
    iput-object p4, p0, Le/b/a/s;->B:Landroid/content/Context;

    .line 6
    invoke-virtual {p2, p3}, Le/b/a/u;->b(Ljava/lang/Class;)Le/b/a/v;

    move-result-object p3

    iput-object p3, p0, Le/b/a/s;->F:Le/b/a/v;

    .line 7
    invoke-virtual {p1}, Le/b/a/d;->f()Le/b/a/j;

    move-result-object p1

    iput-object p1, p0, Le/b/a/s;->E:Le/b/a/j;

    .line 8
    invoke-virtual {p2}, Le/b/a/u;->f()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/s;->a(Ljava/util/List;)V

    .line 9
    invoke-virtual {p2}, Le/b/a/u;->g()Le/b/a/c0/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/s;->a(Le/b/a/c0/a;)Le/b/a/s;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Le/b/a/c0/a;)Le/b/a/c0/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/b/a/s;->a(Le/b/a/c0/a;)Le/b/a/s;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/d;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/o/h<",
            "TTranscodeType;>;",
            "Le/b/a/c0/i<",
            "TTranscodeType;>;",
            "Le/b/a/c0/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Le/b/a/c0/d;"
        }
    .end annotation

    .line 38
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v5, p0, Le/b/a/s;->F:Le/b/a/v;

    .line 39
    invoke-virtual {p3}, Le/b/a/c0/a;->o()Le/b/a/n;

    move-result-object v6

    .line 40
    invoke-virtual {p3}, Le/b/a/c0/a;->l()I

    move-result v7

    .line 41
    invoke-virtual {p3}, Le/b/a/c0/a;->k()I

    move-result v8

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v9, p3

    move-object v10, p4

    .line 42
    invoke-virtual/range {v0 .. v10}, Le/b/a/s;->a(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILe/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/d;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILjava/util/concurrent/Executor;)Le/b/a/c0/d;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Le/b/a/c0/o/h<",
            "TTranscodeType;>;",
            "Le/b/a/c0/i<",
            "TTranscodeType;>;",
            "Le/b/a/c0/a<",
            "*>;",
            "Le/b/a/c0/f;",
            "Le/b/a/v<",
            "*-TTranscodeType;>;",
            "Le/b/a/n;",
            "II",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Le/b/a/c0/d;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 55
    iget-object v1, v0, Le/b/a/s;->B:Landroid/content/Context;

    iget-object v2, v0, Le/b/a/s;->E:Le/b/a/j;

    iget-object v4, v0, Le/b/a/s;->G:Ljava/lang/Object;

    iget-object v5, v0, Le/b/a/s;->D:Ljava/lang/Class;

    iget-object v12, v0, Le/b/a/s;->H:Ljava/util/List;

    .line 56
    invoke-virtual {v2}, Le/b/a/j;->d()Le/b/a/y/x/j0;

    move-result-object v14

    .line 57
    invoke-virtual/range {p6 .. p6}, Le/b/a/v;->a()Le/b/a/c0/p/e;

    move-result-object v15

    move-object/from16 v3, p1

    move-object/from16 v6, p4

    move/from16 v7, p8

    move/from16 v8, p9

    move-object/from16 v9, p7

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v13, p5

    move-object/from16 v16, p10

    .line 58
    invoke-static/range {v1 .. v16}, Le/b/a/c0/m;->a(Landroid/content/Context;Le/b/a/j;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Le/b/a/c0/a;IILe/b/a/n;Le/b/a/c0/o/h;Le/b/a/c0/i;Ljava/util/List;Le/b/a/c0/f;Le/b/a/y/x/j0;Le/b/a/c0/p/e;Ljava/util/concurrent/Executor;)Le/b/a/c0/m;

    move-result-object v1

    return-object v1
.end method

.method public final a(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILe/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/d;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Le/b/a/c0/o/h<",
            "TTranscodeType;>;",
            "Le/b/a/c0/i<",
            "TTranscodeType;>;",
            "Le/b/a/c0/f;",
            "Le/b/a/v<",
            "*-TTranscodeType;>;",
            "Le/b/a/n;",
            "II",
            "Le/b/a/c0/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Le/b/a/c0/d;"
        }
    .end annotation

    move-object/from16 v11, p0

    .line 43
    iget-object v0, v11, Le/b/a/s;->J:Le/b/a/s;

    if-eqz v0, :cond_0

    .line 44
    new-instance v0, Le/b/a/c0/b;

    move-object/from16 v13, p1

    move-object/from16 v1, p4

    invoke-direct {v0, v13, v1}, Le/b/a/c0/b;-><init>(Ljava/lang/Object;Le/b/a/c0/f;)V

    move-object v4, v0

    move-object v15, v4

    goto :goto_0

    :cond_0
    move-object/from16 v13, p1

    move-object/from16 v1, p4

    const/4 v0, 0x0

    move-object v15, v0

    move-object v4, v1

    :goto_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    .line 45
    invoke-virtual/range {v0 .. v10}, Le/b/a/s;->b(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILe/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/d;

    move-result-object v0

    if-nez v15, :cond_1

    return-object v0

    .line 46
    :cond_1
    iget-object v1, v11, Le/b/a/s;->J:Le/b/a/s;

    invoke-virtual {v1}, Le/b/a/c0/a;->l()I

    move-result v1

    .line 47
    iget-object v2, v11, Le/b/a/s;->J:Le/b/a/s;

    invoke-virtual {v2}, Le/b/a/c0/a;->k()I

    move-result v2

    .line 48
    invoke-static/range {p7 .. p8}, Le/b/a/e0/t;->b(II)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v11, Le/b/a/s;->J:Le/b/a/s;

    invoke-virtual {v3}, Le/b/a/c0/a;->D()Z

    move-result v3

    if-nez v3, :cond_2

    .line 49
    invoke-virtual/range {p9 .. p9}, Le/b/a/c0/a;->l()I

    move-result v1

    .line 50
    invoke-virtual/range {p9 .. p9}, Le/b/a/c0/a;->k()I

    move-result v2

    :cond_2
    move/from16 v19, v1

    move/from16 v20, v2

    .line 51
    iget-object v12, v11, Le/b/a/s;->J:Le/b/a/s;

    iget-object v1, v12, Le/b/a/s;->F:Le/b/a/v;

    .line 52
    invoke-virtual {v12}, Le/b/a/c0/a;->o()Le/b/a/n;

    move-result-object v18

    iget-object v2, v11, Le/b/a/s;->J:Le/b/a/s;

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move-object v3, v15

    move-object/from16 v15, p3

    move-object/from16 v16, v3

    move-object/from16 v17, v1

    move-object/from16 v21, v2

    move-object/from16 v22, p10

    .line 53
    invoke-virtual/range {v12 .. v22}, Le/b/a/s;->a(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILe/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/d;

    move-result-object v1

    .line 54
    invoke-virtual {v3, v0, v1}, Le/b/a/c0/b;->a(Le/b/a/c0/d;Le/b/a/c0/d;)V

    return-object v3
.end method

.method public a(Le/b/a/c0/o/h;)Le/b/a/c0/o/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Le/b/a/c0/o/h<",
            "TTranscodeType;>;>(TY;)TY;"
        }
    .end annotation

    .line 21
    invoke-static {}, Le/b/a/e0/i;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Le/b/a/s;->a(Le/b/a/c0/o/h;Le/b/a/c0/i;Ljava/util/concurrent/Executor;)Le/b/a/c0/o/h;

    return-object p1
.end method

.method public a(Le/b/a/c0/o/h;Le/b/a/c0/i;Ljava/util/concurrent/Executor;)Le/b/a/c0/o/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Le/b/a/c0/o/h<",
            "TTranscodeType;>;>(TY;",
            "Le/b/a/c0/i<",
            "TTranscodeType;>;",
            "Ljava/util/concurrent/Executor;",
            ")TY;"
        }
    .end annotation

    .line 22
    invoke-virtual {p0, p1, p2, p0, p3}, Le/b/a/s;->b(Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/o/h;

    return-object p1
.end method

.method public a(Landroid/widget/ImageView;)Le/b/a/c0/o/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "Le/b/a/c0/o/k<",
            "Landroid/widget/ImageView;",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 24
    invoke-static {}, Le/b/a/e0/t;->b()V

    .line 25
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    invoke-virtual {p0}, Le/b/a/c0/a;->C()Z

    move-result v0

    if-nez v0, :cond_0

    .line 27
    invoke-virtual {p0}, Le/b/a/c0/a;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 29
    sget-object v0, Le/b/a/r;->a:[I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 30
    :pswitch_0
    invoke-virtual {p0}, Le/b/a/s;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/c0/a;->G()Le/b/a/c0/a;

    move-result-object v0

    goto :goto_1

    .line 31
    :pswitch_1
    invoke-virtual {p0}, Le/b/a/s;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/c0/a;->H()Le/b/a/c0/a;

    move-result-object v0

    goto :goto_1

    .line 32
    :pswitch_2
    invoke-virtual {p0}, Le/b/a/s;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/c0/a;->G()Le/b/a/c0/a;

    move-result-object v0

    goto :goto_1

    .line 33
    :pswitch_3
    invoke-virtual {p0}, Le/b/a/s;->clone()Le/b/a/c0/a;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/c0/a;->F()Le/b/a/c0/a;

    move-result-object v0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v0, p0

    .line 34
    :goto_1
    iget-object v1, p0, Le/b/a/s;->E:Le/b/a/j;

    iget-object v2, p0, Le/b/a/s;->D:Ljava/lang/Class;

    .line 35
    invoke-virtual {v1, p1, v2}, Le/b/a/j;->a(Landroid/widget/ImageView;Ljava/lang/Class;)Le/b/a/c0/o/k;

    move-result-object p1

    const/4 v1, 0x0

    .line 36
    invoke-static {}, Le/b/a/e0/i;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 37
    invoke-virtual {p0, p1, v1, v0, v2}, Le/b/a/s;->b(Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/o/h;

    check-cast p1, Le/b/a/c0/o/k;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Landroid/net/Uri;)Le/b/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 14
    invoke-virtual {p0, p1}, Le/b/a/s;->b(Ljava/lang/Object;)Le/b/a/s;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le/b/a/s;->a(Landroid/net/Uri;Le/b/a/s;)Le/b/a/s;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/net/Uri;Le/b/a/s;)Le/b/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Le/b/a/s<",
            "TTranscodeType;>;)",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 15
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.resource"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p2}, Le/b/a/s;->a(Le/b/a/s;)Le/b/a/s;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object p2
.end method

.method public a(Le/b/a/c0/a;)Le/b/a/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/a<",
            "*>;)",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 4
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-super {p0, p1}, Le/b/a/c0/a;->a(Le/b/a/c0/a;)Le/b/a/c0/a;

    move-result-object p1

    check-cast p1, Le/b/a/s;

    return-object p1
.end method

.method public a(Le/b/a/c0/i;)Le/b/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/i<",
            "TTranscodeType;>;)",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 6
    invoke-virtual {p0}, Le/b/a/c0/a;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p0}, Le/b/a/s;->clone()Le/b/a/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/s;->a(Le/b/a/c0/i;)Le/b/a/s;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    .line 8
    iget-object v0, p0, Le/b/a/s;->H:Ljava/util/List;

    if-nez v0, :cond_1

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b/a/s;->H:Ljava/util/List;

    .line 10
    :cond_1
    iget-object v0, p0, Le/b/a/s;->H:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_2
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    move-object p1, p0

    check-cast p1, Le/b/a/s;

    return-object p1
.end method

.method public final a(Le/b/a/s;)Le/b/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/s<",
            "TTranscodeType;>;)",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Le/b/a/s;->B:Landroid/content/Context;

    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/b/a/c0/a;->a(Landroid/content/res/Resources$Theme;)Le/b/a/c0/a;

    move-result-object p1

    check-cast p1, Le/b/a/s;

    iget-object v0, p0, Le/b/a/s;->B:Landroid/content/Context;

    .line 19
    invoke-static {v0}, Le/b/a/d0/a;->a(Landroid/content/Context;)Le/b/a/y/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/b/a/c0/a;->a(Le/b/a/y/n;)Le/b/a/c0/a;

    move-result-object p1

    check-cast p1, Le/b/a/s;

    return-object p1
.end method

.method public a(Ljava/lang/Integer;)Le/b/a/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 20
    invoke-virtual {p0, p1}, Le/b/a/s;->b(Ljava/lang/Object;)Le/b/a/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/s;->a(Le/b/a/s;)Le/b/a/s;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Object;)Le/b/a/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 12
    invoke-virtual {p0, p1}, Le/b/a/s;->b(Ljava/lang/Object;)Le/b/a/s;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;)Le/b/a/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 13
    invoke-virtual {p0, p1}, Le/b/a/s;->b(Ljava/lang/Object;)Le/b/a/s;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/c0/i;

    .line 3
    invoke-virtual {p0, v0}, Le/b/a/s;->a(Le/b/a/c0/i;)Le/b/a/s;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Le/b/a/c0/a;Le/b/a/c0/d;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/a<",
            "*>;",
            "Le/b/a/c0/d;",
            ")Z"
        }
    .end annotation

    .line 23
    invoke-virtual {p1}, Le/b/a/c0/a;->x()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2}, Le/b/a/c0/d;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILe/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/d;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Le/b/a/c0/o/h<",
            "TTranscodeType;>;",
            "Le/b/a/c0/i<",
            "TTranscodeType;>;",
            "Le/b/a/c0/f;",
            "Le/b/a/v<",
            "*-TTranscodeType;>;",
            "Le/b/a/n;",
            "II",
            "Le/b/a/c0/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Le/b/a/c0/d;"
        }
    .end annotation

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v5, p4

    move-object/from16 v13, p6

    .line 23
    iget-object v0, v11, Le/b/a/s;->I:Le/b/a/s;

    if-eqz v0, :cond_4

    .line 24
    iget-boolean v1, v11, Le/b/a/s;->N:Z

    if-nez v1, :cond_3

    .line 25
    iget-object v1, v0, Le/b/a/s;->F:Le/b/a/v;

    .line 26
    iget-boolean v0, v0, Le/b/a/s;->L:Z

    if-eqz v0, :cond_0

    move-object/from16 v14, p5

    goto :goto_0

    :cond_0
    move-object v14, v1

    .line 27
    :goto_0
    iget-object v0, v11, Le/b/a/s;->I:Le/b/a/s;

    invoke-virtual {v0}, Le/b/a/c0/a;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28
    iget-object v0, v11, Le/b/a/s;->I:Le/b/a/s;

    invoke-virtual {v0}, Le/b/a/c0/a;->o()Le/b/a/n;

    move-result-object v0

    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v11, v13}, Le/b/a/s;->b(Le/b/a/n;)Le/b/a/n;

    move-result-object v0

    :goto_1
    move-object v15, v0

    .line 30
    iget-object v0, v11, Le/b/a/s;->I:Le/b/a/s;

    invoke-virtual {v0}, Le/b/a/c0/a;->l()I

    move-result v0

    .line 31
    iget-object v1, v11, Le/b/a/s;->I:Le/b/a/s;

    invoke-virtual {v1}, Le/b/a/c0/a;->k()I

    move-result v1

    .line 32
    invoke-static/range {p7 .. p8}, Le/b/a/e0/t;->b(II)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v11, Le/b/a/s;->I:Le/b/a/s;

    .line 33
    invoke-virtual {v2}, Le/b/a/c0/a;->D()Z

    move-result v2

    if-nez v2, :cond_2

    .line 34
    invoke-virtual/range {p9 .. p9}, Le/b/a/c0/a;->l()I

    move-result v0

    .line 35
    invoke-virtual/range {p9 .. p9}, Le/b/a/c0/a;->k()I

    move-result v1

    :cond_2
    move/from16 v16, v0

    move/from16 v17, v1

    .line 36
    new-instance v10, Le/b/a/c0/n;

    invoke-direct {v10, v12, v5}, Le/b/a/c0/n;-><init>(Ljava/lang/Object;Le/b/a/c0/f;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object v5, v10

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object v13, v10

    move-object/from16 v10, p10

    .line 37
    invoke-virtual/range {v0 .. v10}, Le/b/a/s;->a(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILjava/util/concurrent/Executor;)Le/b/a/c0/d;

    move-result-object v10

    const/4 v0, 0x1

    .line 38
    iput-boolean v0, v11, Le/b/a/s;->N:Z

    .line 39
    iget-object v9, v11, Le/b/a/s;->I:Le/b/a/s;

    move-object v0, v9

    move-object v4, v13

    move-object v5, v14

    move-object v6, v15

    move/from16 v7, v16

    move/from16 v8, v17

    move-object v12, v10

    move-object/from16 v10, p10

    .line 40
    invoke-virtual/range {v0 .. v10}, Le/b/a/s;->a(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILe/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/d;

    move-result-object v0

    const/4 v1, 0x0

    .line 41
    iput-boolean v1, v11, Le/b/a/s;->N:Z

    .line 42
    invoke-virtual {v13, v12, v0}, Le/b/a/c0/n;->a(Le/b/a/c0/d;Le/b/a/c0/d;)V

    return-object v13

    .line 43
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_4
    iget-object v0, v11, Le/b/a/s;->K:Ljava/lang/Float;

    if-eqz v0, :cond_5

    .line 45
    new-instance v14, Le/b/a/c0/n;

    invoke-direct {v14, v12, v5}, Le/b/a/c0/n;-><init>(Ljava/lang/Object;Le/b/a/c0/f;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object v5, v14

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    .line 46
    invoke-virtual/range {v0 .. v10}, Le/b/a/s;->a(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILjava/util/concurrent/Executor;)Le/b/a/c0/d;

    move-result-object v15

    .line 47
    invoke-virtual/range {p9 .. p9}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    iget-object v1, v11, Le/b/a/s;->K:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Le/b/a/c0/a;->a(F)Le/b/a/c0/a;

    move-result-object v4

    .line 48
    invoke-virtual {v11, v13}, Le/b/a/s;->b(Le/b/a/n;)Le/b/a/n;

    move-result-object v7

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 49
    invoke-virtual/range {v0 .. v10}, Le/b/a/s;->a(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILjava/util/concurrent/Executor;)Le/b/a/c0/d;

    move-result-object v0

    .line 50
    invoke-virtual {v14, v15, v0}, Le/b/a/c0/n;->a(Le/b/a/c0/d;Le/b/a/c0/d;)V

    return-object v14

    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    .line 51
    invoke-virtual/range {v0 .. v10}, Le/b/a/s;->a(Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Le/b/a/c0/f;Le/b/a/v;Le/b/a/n;IILjava/util/concurrent/Executor;)Le/b/a/c0/d;

    move-result-object v0

    return-object v0
.end method

.method public final b(Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/o/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Le/b/a/c0/o/h<",
            "TTranscodeType;>;>(TY;",
            "Le/b/a/c0/i<",
            "TTranscodeType;>;",
            "Le/b/a/c0/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")TY;"
        }
    .end annotation

    .line 6
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-boolean v0, p0, Le/b/a/s;->M:Z

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/s;->a(Le/b/a/c0/o/h;Le/b/a/c0/i;Le/b/a/c0/a;Ljava/util/concurrent/Executor;)Le/b/a/c0/d;

    move-result-object p2

    .line 9
    invoke-interface {p1}, Le/b/a/c0/o/h;->c()Le/b/a/c0/d;

    move-result-object p4

    .line 10
    invoke-interface {p2, p4}, Le/b/a/c0/d;->d(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p0, p3, p4}, Le/b/a/s;->a(Le/b/a/c0/a;Le/b/a/c0/d;)Z

    move-result p3

    if-nez p3, :cond_1

    .line 12
    invoke-static {p4}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object p2, p4

    check-cast p2, Le/b/a/c0/d;

    invoke-interface {p2}, Le/b/a/c0/d;->isRunning()Z

    move-result p2

    if-nez p2, :cond_0

    .line 13
    invoke-interface {p4}, Le/b/a/c0/d;->d()V

    :cond_0
    return-object p1

    .line 14
    :cond_1
    iget-object p3, p0, Le/b/a/s;->C:Le/b/a/u;

    invoke-virtual {p3, p1}, Le/b/a/u;->a(Le/b/a/c0/o/h;)V

    .line 15
    invoke-interface {p1, p2}, Le/b/a/c0/o/h;->a(Le/b/a/c0/d;)V

    .line 16
    iget-object p3, p0, Le/b/a/s;->C:Le/b/a/u;

    invoke-virtual {p3, p1, p2}, Le/b/a/u;->a(Le/b/a/c0/o/h;Le/b/a/c0/d;)V

    return-object p1

    .line 17
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must call #load() before calling #into()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Le/b/a/n;)Le/b/a/n;
    .locals 2

    .line 18
    sget-object v0, Le/b/a/r;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown priority: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/b/a/c0/a;->o()Le/b/a/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_1
    :goto_0
    sget-object p1, Le/b/a/n;->b:Le/b/a/n;

    return-object p1

    .line 21
    :cond_2
    sget-object p1, Le/b/a/n;->c:Le/b/a/n;

    return-object p1

    .line 22
    :cond_3
    sget-object p1, Le/b/a/n;->d:Le/b/a/n;

    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Le/b/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/b/a/c0/a;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/b/a/s;->clone()Le/b/a/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/s;->b(Ljava/lang/Object;)Le/b/a/s;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iput-object p1, p0, Le/b/a/s;->G:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Le/b/a/s;->M:Z

    .line 5
    invoke-virtual {p0}, Le/b/a/c0/a;->J()Le/b/a/c0/a;

    move-object p1, p0

    check-cast p1, Le/b/a/s;

    return-object p1
.end method

.method public c(II)Le/b/a/c0/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Le/b/a/c0/c<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/c0/h;

    invoke-direct {v0, p1, p2}, Le/b/a/c0/h;-><init>(II)V

    .line 2
    invoke-static {}, Le/b/a/e0/i;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0, v0, v0, p1}, Le/b/a/s;->a(Le/b/a/c0/o/h;Le/b/a/c0/i;Ljava/util/concurrent/Executor;)Le/b/a/c0/o/h;

    check-cast v0, Le/b/a/c0/c;

    return-object v0
.end method

.method public bridge synthetic clone()Le/b/a/c0/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/s;->clone()Le/b/a/s;

    move-result-object v0

    return-object v0
.end method

.method public clone()Le/b/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/b/a/s<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 3
    invoke-super {p0}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/s;

    .line 4
    iget-object v1, v0, Le/b/a/s;->F:Le/b/a/v;

    invoke-virtual {v1}, Le/b/a/v;->clone()Le/b/a/v;

    move-result-object v1

    iput-object v1, v0, Le/b/a/s;->F:Le/b/a/v;

    .line 5
    iget-object v1, v0, Le/b/a/s;->H:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Le/b/a/s;->H:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Le/b/a/s;->H:Ljava/util/List;

    .line 7
    :cond_0
    iget-object v1, v0, Le/b/a/s;->I:Le/b/a/s;

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {v1}, Le/b/a/s;->clone()Le/b/a/s;

    move-result-object v1

    iput-object v1, v0, Le/b/a/s;->I:Le/b/a/s;

    .line 9
    :cond_1
    iget-object v1, v0, Le/b/a/s;->J:Le/b/a/s;

    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {v1}, Le/b/a/s;->clone()Le/b/a/s;

    move-result-object v1

    iput-object v1, v0, Le/b/a/s;->J:Le/b/a/s;

    :cond_2
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Le/b/a/s;->clone()Le/b/a/s;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Le/b/a/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Le/b/a/s;

    .line 3
    invoke-super {p0, p1}, Le/b/a/c0/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/s;->D:Ljava/lang/Class;

    iget-object v2, p1, Le/b/a/s;->D:Ljava/lang/Class;

    .line 4
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/s;->F:Le/b/a/v;

    iget-object v2, p1, Le/b/a/s;->F:Le/b/a/v;

    .line 5
    invoke-virtual {v0, v2}, Le/b/a/v;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/s;->G:Ljava/lang/Object;

    iget-object v2, p1, Le/b/a/s;->G:Ljava/lang/Object;

    .line 6
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/s;->H:Ljava/util/List;

    iget-object v2, p1, Le/b/a/s;->H:Ljava/util/List;

    .line 7
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/s;->I:Le/b/a/s;

    iget-object v2, p1, Le/b/a/s;->I:Le/b/a/s;

    .line 8
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/s;->J:Le/b/a/s;

    iget-object v2, p1, Le/b/a/s;->J:Le/b/a/s;

    .line 9
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/s;->K:Ljava/lang/Float;

    iget-object v2, p1, Le/b/a/s;->K:Ljava/lang/Float;

    .line 10
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Le/b/a/s;->L:Z

    iget-boolean v2, p1, Le/b/a/s;->L:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Le/b/a/s;->M:Z

    iget-boolean p1, p1, Le/b/a/s;->M:Z

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Le/b/a/c0/a;->hashCode()I

    move-result v0

    .line 2
    iget-object v1, p0, Le/b/a/s;->D:Ljava/lang/Class;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 3
    iget-object v1, p0, Le/b/a/s;->F:Le/b/a/v;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 4
    iget-object v1, p0, Le/b/a/s;->G:Ljava/lang/Object;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 5
    iget-object v1, p0, Le/b/a/s;->H:Ljava/util/List;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 6
    iget-object v1, p0, Le/b/a/s;->I:Le/b/a/s;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 7
    iget-object v1, p0, Le/b/a/s;->J:Le/b/a/s;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 8
    iget-object v1, p0, Le/b/a/s;->K:Ljava/lang/Float;

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(Ljava/lang/Object;I)I

    move-result v0

    .line 9
    iget-boolean v1, p0, Le/b/a/s;->L:Z

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(ZI)I

    move-result v0

    .line 10
    iget-boolean v1, p0, Le/b/a/s;->M:Z

    invoke-static {v1, v0}, Le/b/a/e0/t;->a(ZI)I

    move-result v0

    return v0
.end method
