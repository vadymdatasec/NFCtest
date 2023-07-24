.class public final Le/b/a/y/y/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/w/e<",
        "TDataT;>;"
    }
.end annotation


# instance fields
.field public final b:Landroid/content/res/Resources$Theme;

.field public final c:Landroid/content/res/Resources;

.field public final d:Le/b/a/y/y/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/y<",
            "TDataT;>;"
        }
    .end annotation
.end field

.field public final e:I

.field public f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDataT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Le/b/a/y/y/y;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources$Theme;",
            "Landroid/content/res/Resources;",
            "Le/b/a/y/y/y<",
            "TDataT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/x;->b:Landroid/content/res/Resources$Theme;

    .line 3
    iput-object p2, p0, Le/b/a/y/y/x;->c:Landroid/content/res/Resources;

    .line 4
    iput-object p3, p0, Le/b/a/y/y/x;->d:Le/b/a/y/y/y;

    .line 5
    iput p4, p0, Le/b/a/y/y/x;->e:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TDataT;>;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/b/a/y/y/x;->d:Le/b/a/y/y/y;

    invoke-interface {v0}, Le/b/a/y/y/y;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public a(Le/b/a/n;Le/b/a/y/w/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/n;",
            "Le/b/a/y/w/d<",
            "-TDataT;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p1, p0, Le/b/a/y/y/x;->d:Le/b/a/y/y/y;

    iget-object v0, p0, Le/b/a/y/y/x;->b:Landroid/content/res/Resources$Theme;

    iget-object v1, p0, Le/b/a/y/y/x;->c:Landroid/content/res/Resources;

    iget v2, p0, Le/b/a/y/y/x;->e:I

    invoke-interface {p1, v0, v1, v2}, Le/b/a/y/y/y;->a(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Le/b/a/y/y/x;->f:Ljava/lang/Object;

    .line 2
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/y/x;->f:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/y/y/x;->d:Le/b/a/y/y/y;

    invoke-interface {v1, v0}, Le/b/a/y/y/y;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public c()Le/b/a/y/a;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/y/a;->b:Le/b/a/y/a;

    return-object v0
.end method

.method public cancel()V
    .locals 0

    return-void
.end method
