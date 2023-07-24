.class public final synthetic Le/f/a/d/a/b/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# static fields
.field public static final a:Ljava/io/FilenameFilter;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/a/d/a/b/m2;

    invoke-direct {v0}, Le/f/a/d/a/b/m2;-><init>()V

    sput-object v0, Le/f/a/d/a/b/m2;->a:Ljava/io/FilenameFilter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p2}, Le/f/a/d/a/b/n2;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
