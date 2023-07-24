.class public Le/b/a/y/y/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;
.implements Le/b/a/y/y/y1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "Landroid/net/Uri;",
        "Ljava/io/InputStream;",
        ">;",
        "Le/b/a/y/y/y1<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/z1;->a:Landroid/content/ContentResolver;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Le/b/a/y/w/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Le/b/a/y/w/e<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/y/w/v;

    iget-object v1, p0, Le/b/a/y/y/z1;->a:Landroid/content/ContentResolver;

    invoke-direct {v0, v1, p1}, Le/b/a/y/w/v;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    return-object v0
.end method

.method public a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/g1;",
            ")",
            "Le/b/a/y/y/w0<",
            "Landroid/net/Uri;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance p1, Le/b/a/y/y/a2;

    invoke-direct {p1, p0}, Le/b/a/y/y/a2;-><init>(Le/b/a/y/y/y1;)V

    return-object p1
.end method
