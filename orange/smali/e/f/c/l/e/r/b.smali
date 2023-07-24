.class public final synthetic Le/f/c/l/e/r/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FileFilter;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/l/e/r/b;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/io/FileFilter;
    .locals 1

    new-instance v0, Le/f/c/l/e/r/b;

    invoke-direct {v0, p0}, Le/f/c/l/e/r/b;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 1

    iget-object v0, p0, Le/f/c/l/e/r/b;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Le/f/c/l/e/r/g;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result p1

    return p1
.end method
