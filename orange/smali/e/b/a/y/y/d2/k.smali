.class public final Le/b/a/y/y/d2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/y/w0<",
        "Landroid/net/Uri;",
        "TDataT;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/b/a/y/y/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/w0<",
            "Ljava/io/File;",
            "TDataT;>;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/y/y/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/w0<",
            "Landroid/net/Uri;",
            "TDataT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TDataT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/b/a/y/y/w0;Le/b/a/y/y/w0;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/b/a/y/y/w0<",
            "Ljava/io/File;",
            "TDataT;>;",
            "Le/b/a/y/y/w0<",
            "Landroid/net/Uri;",
            "TDataT;>;",
            "Ljava/lang/Class<",
            "TDataT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Le/b/a/y/y/d2/k;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/b/a/y/y/d2/k;->b:Le/b/a/y/y/w0;

    .line 4
    iput-object p3, p0, Le/b/a/y/y/d2/k;->c:Le/b/a/y/y/w0;

    .line 5
    iput-object p4, p0, Le/b/a/y/y/d2/k;->d:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/y/v0<",
            "TDataT;>;"
        }
    .end annotation

    move-object v0, p0

    .line 3
    new-instance v1, Le/b/a/y/y/v0;

    new-instance v2, Le/b/a/d0/d;

    move-object v7, p1

    invoke-direct {v2, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V

    new-instance v12, Le/b/a/y/y/d2/j;

    iget-object v4, v0, Le/b/a/y/y/d2/k;->a:Landroid/content/Context;

    iget-object v5, v0, Le/b/a/y/y/d2/k;->b:Le/b/a/y/y/w0;

    iget-object v6, v0, Le/b/a/y/y/d2/k;->c:Le/b/a/y/y/w0;

    iget-object v11, v0, Le/b/a/y/y/d2/k;->d:Ljava/lang/Class;

    move-object v3, v12

    move v8, p2

    move/from16 v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v3 .. v11}, Le/b/a/y/y/d2/j;-><init>(Landroid/content/Context;Le/b/a/y/y/w0;Le/b/a/y/y/w0;Landroid/net/Uri;IILe/b/a/y/r;Ljava/lang/Class;)V

    invoke-direct {v1, v2, v12}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V

    return-object v1
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/d2/k;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/net/Uri;)Z
    .locals 2

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Le/b/a/y/w/w/b;->b(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 2
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Le/b/a/y/y/d2/k;->a(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method
