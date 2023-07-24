.class public abstract Le/b/a/y/y/d2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "Landroid/net/Uri;",
        "TDataT;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TDataT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "TDataT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/d2/g;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/b/a/y/y/d2/g;->b:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/g1;",
            ")",
            "Le/b/a/y/y/w0<",
            "Landroid/net/Uri;",
            "TDataT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/y/y/d2/k;

    iget-object v1, p0, Le/b/a/y/y/d2/g;->a:Landroid/content/Context;

    const-class v2, Ljava/io/File;

    iget-object v3, p0, Le/b/a/y/y/d2/g;->b:Ljava/lang/Class;

    .line 2
    invoke-virtual {p1, v2, v3}, Le/b/a/y/y/g1;->a(Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/y/w0;

    move-result-object v2

    const-class v3, Landroid/net/Uri;

    iget-object v4, p0, Le/b/a/y/y/d2/g;->b:Ljava/lang/Class;

    .line 3
    invoke-virtual {p1, v3, v4}, Le/b/a/y/y/g1;->a(Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/y/w0;

    move-result-object p1

    iget-object v3, p0, Le/b/a/y/y/d2/g;->b:Ljava/lang/Class;

    invoke-direct {v0, v1, v2, p1, v3}, Le/b/a/y/y/d2/k;-><init>(Landroid/content/Context;Le/b/a/y/y/w0;Le/b/a/y/y/w0;Ljava/lang/Class;)V

    return-object v0
.end method
