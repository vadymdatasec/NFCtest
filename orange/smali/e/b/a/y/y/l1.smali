.class public final Le/b/a/y/y/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "Landroid/net/Uri;",
        "Landroid/content/res/AssetFileDescriptor;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/l1;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/g1;",
            ")",
            "Le/b/a/y/y/w0<",
            "Landroid/net/Uri;",
            "Landroid/content/res/AssetFileDescriptor;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/y/y/n1;

    iget-object v1, p0, Le/b/a/y/y/l1;->a:Landroid/content/Context;

    const-class v2, Ljava/lang/Integer;

    const-class v3, Landroid/content/res/AssetFileDescriptor;

    .line 2
    invoke-virtual {p1, v2, v3}, Le/b/a/y/y/g1;->a(Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/y/w0;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Le/b/a/y/y/n1;-><init>(Landroid/content/Context;Le/b/a/y/y/w0;)V

    return-object v0
.end method
