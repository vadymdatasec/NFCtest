.class public Le/f/c/l/e/m/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/c/l/e/m/v0;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/v0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/r;->b:Le/f/c/l/e/m/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/r;->b:Le/f/c/l/e/m/v0;

    new-instance v1, Le/f/c/l/e/m/p0;

    invoke-direct {v1}, Le/f/c/l/e/m/p0;-><init>()V

    invoke-static {v0, v1}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/m/v0;Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/l/e/m/v0;->a([Ljava/io/File;)V

    return-void
.end method
