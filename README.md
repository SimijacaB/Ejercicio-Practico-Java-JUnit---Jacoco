# Ejercicios Practicos Java con JUnit5 y Jacoco

## Descripción

Este proyecto utiliza **JUnit5** para realizar pruebas unitarias y **Jacoco** para medir la cobertura de código. La combinación de estas herramientas asegura que el código esté bien probado y cubierto, proporcionando métricas de calidad.

### JUnit5

JUnit5 es la última versión de JUnit, una biblioteca ampliamente utilizada para realizar pruebas unitarias en proyectos Java. Con JUnit5, puedes crear y ejecutar pruebas para verificar que tu código funciona correctamente.

### Jacoco

Jacoco (Java Code Coverage) es una herramienta para medir la cobertura de código. La cobertura de código indica qué partes del código son ejecutadas por las pruebas, lo que ayuda a identificar áreas no probadas y mejorar la calidad del software.

## Configuración

### Maven

Para usar Jacoco con Maven, añade la siguiente configuración a tu archivo `pom.xml`:

```xml
<project>
     <build>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.12</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>jacoco-check</id>
                        <goals>
                            <goal>check</goal>
                        </goals>
                        <configuration>
                            <rules>
                                <rule>
                                    <element>PACKAGE</element>
                                    <limits>
                                        <limit>
                                            <counter>LINE</counter>
                                            <value>COVEREDRATIO</value>
                                            <minimum>0.85</minimum>
                                        </limit>
                                    </limits>
                                </rule>
                            </rules>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
    
</project>
