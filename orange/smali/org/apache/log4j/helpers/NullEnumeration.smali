.class public Lorg/apache/log4j/helpers/NullEnumeration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Enumeration;


# static fields
.field public static final a:Lorg/apache/log4j/helpers/NullEnumeration;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/log4j/helpers/NullEnumeration;

    invoke-direct {v0}, Lorg/apache/log4j/helpers/NullEnumeration;-><init>()V

    sput-object v0, Lorg/apache/log4j/helpers/NullEnumeration;->a:Lorg/apache/log4j/helpers/NullEnumeration;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lorg/apache/log4j/helpers/NullEnumeration;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/helpers/NullEnumeration;->a:Lorg/apache/log4j/helpers/NullEnumeration;

    return-object v0
.end method


# virtual methods
.method public hasMoreElements()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public nextElement()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
