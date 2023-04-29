package store;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Objects;

interface Saveable {
    void save(BufferedWriter bw) throws IOException;    
}
