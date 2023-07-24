.class public final Le/f/c/l/e/m/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/n/c;


# instance fields
.field public final a:Le/f/c/l/e/r/h;


# direct methods
.method public constructor <init>(Le/f/c/l/e/r/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/m/q0;->a:Le/f/c/l/e/r/h;

    return-void
.end method


# virtual methods
.method public a()Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Le/f/c/l/e/m/q0;->a:Le/f/c/l/e/r/h;

    invoke-interface {v1}, Le/f/c/l/e/r/h;->a()Ljava/io/File;

    move-result-object v1

    const-string v2, "log-files"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    return-object v0
.end method
