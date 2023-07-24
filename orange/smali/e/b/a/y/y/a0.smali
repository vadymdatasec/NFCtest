.class public abstract Le/b/a/y/y/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "Ljava/io/File;",
        "TData;>;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/y/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/e0<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/y/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/e0<",
            "TData;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/a0;->a:Le/b/a/y/y/e0;

    return-void
.end method


# virtual methods
.method public final a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/g1;",
            ")",
            "Le/b/a/y/y/w0<",
            "Ljava/io/File;",
            "TData;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Le/b/a/y/y/h0;

    iget-object v0, p0, Le/b/a/y/y/a0;->a:Le/b/a/y/y/e0;

    invoke-direct {p1, v0}, Le/b/a/y/y/h0;-><init>(Le/b/a/y/y/e0;)V

    return-object p1
.end method
