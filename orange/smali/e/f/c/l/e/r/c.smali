.class public final synthetic Le/f/c/l/e/r/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# static fields
.field public static final a:Le/f/c/l/e/r/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/l/e/r/c;

    invoke-direct {v0}, Le/f/c/l/e/r/c;-><init>()V

    sput-object v0, Le/f/c/l/e/r/c;->a:Le/f/c/l/e/r/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/io/FilenameFilter;
    .locals 1

    sget-object v0, Le/f/c/l/e/r/c;->a:Le/f/c/l/e/r/c;

    return-object v0
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1, p2}, Le/f/c/l/e/r/g;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
